package com.nv.resumebuilder.controllers;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.nv.resumebuilder.entity.AchievementsAndHonoursEntity;
import com.nv.resumebuilder.entity.EducationalDetailsEntity;
import com.nv.resumebuilder.entity.ExperienceDetailsEntity;
import com.nv.resumebuilder.entity.OrganizationalDetailsEntity;
import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.entity.ProjectDetailsEntity;
import com.nv.resumebuilder.entity.ReferenceDetailsEntity;
import com.nv.resumebuilder.entity.ResumeTemplateEntity;
import com.nv.resumebuilder.service.AchievementsAndHonoursServices;
import com.nv.resumebuilder.service.EducationalDetailsService;
import com.nv.resumebuilder.service.ExperienceDetailService;
import com.nv.resumebuilder.service.OrganizationalDetailsService;
import com.nv.resumebuilder.service.PersonalDetailsServices;
import com.nv.resumebuilder.service.ProjectService;
import com.nv.resumebuilder.service.RefernceDetailsService;

@Controller
public class ResumeTemplateController {
	
	private ResumeTemplateEntity resumeTemplateEntity = new ResumeTemplateEntity();

	@Autowired
	private PersonalDetailsServices personalDetailsServices;

	@Autowired
	private AchievementsAndHonoursServices achievementsAndHonoursServices;

	@Autowired
	private EducationalDetailsService educationalDetailsService;

	@Autowired
	private ExperienceDetailService experienceDetailService;

	@Autowired
	private OrganizationalDetailsService organizationalDetailsService;

	@Autowired
	private ProjectService projectService;

	@Autowired
	private RefernceDetailsService refernceDetailsService;
	@Autowired
	ServletContext servletContext;

	private final TemplateEngine templateEngine;

	private Optional<EducationalDetailsEntity> educationalDetails = null;
	PersonalDetailsEntity personalDetails = null;
	
	private String userFullName;
	
	public ResumeTemplateController(TemplateEngine templateEngine) {
		this.templateEngine = templateEngine;
	}

	@GetMapping("/preview")
	private String downloadResume(HttpSession session, Model model) {
		// personal details
		Long idAttribute = (Long) session.getAttribute("id");

		if (idAttribute == null) {
			model.addAttribute("Error", "Please Fill the form");
			return "redirect:/personalDetails";
		}

		personalDetails = this.personalDetailsServices.findById(idAttribute);

		// Education details
//		Optional<EducationalDetailsEntity> 
		educationalDetails = educationalDetailsService.findByPersonId(idAttribute);
		if (!educationalDetails.isPresent()) {
			return "redirect:/education";
		}

		// Experience details
		Optional<ExperienceDetailsEntity> experienceDetailsEntity = experienceDetailService.findByOtherId(idAttribute);
		if (!experienceDetailsEntity.isPresent()) {
			return "redirect:/experienceDetailForm";
		}

		// project details
		List<ProjectDetailsEntity> projectDetailsEntity = projectService
				.findById(experienceDetailsEntity.get().getExperienceId());

		if (projectDetailsEntity.isEmpty()) {
			return "redirect:/projectDetails.html?id=";
		}

		// organizational details
		Optional<OrganizationalDetailsEntity> organizationalDetailsEntity = organizationalDetailsService.findByOtherId(idAttribute);
		if (!organizationalDetailsEntity.isPresent()) {
			return "redirect:/organizationaldetailsform";
		}

		// achievments and honours details
		Optional<AchievementsAndHonoursEntity> achievementsAndHonours = achievementsAndHonoursServices.findBYPersonId(idAttribute);
		if (!achievementsAndHonours.isPresent()) {
			return "redirect:/AchievementsForm";
		}

		// Reference Details
		List<ReferenceDetailsEntity> refernceDetailsdata = refernceDetailsService.getAllRefernceDetails(idAttribute);

		if (refernceDetailsdata.isEmpty()) {
			return "redirect:/refernceDetails";
		}

		resumeTemplateEntity.setPersonalDetailsEntity(personalDetails);
		userFullName = personalDetails.getUserFirstName() + "_" + personalDetails.getUserLastName();
		resumeTemplateEntity.setEducationalDetailsEntity(educationalDetails.get());
		resumeTemplateEntity.setExperienceDetailsEntity(experienceDetailsEntity.get());
		resumeTemplateEntity.setProjectDetailsEntity(projectDetailsEntity);
		resumeTemplateEntity.setOrganizationalDetailsEntity(organizationalDetailsEntity.get());
		resumeTemplateEntity.setAchievementsAndHonoursEntity(achievementsAndHonours.get());
		resumeTemplateEntity.setReferenceDetailsEntity(refernceDetailsdata);
		model.addAttribute("resumeTemplateEntity", resumeTemplateEntity);
		model.addAttribute("skillsset", Arrays.asList(educationalDetails.get().getTechnicalSkills().split(",")));
		model.addAttribute("languages", Arrays.asList(personalDetails.getLanguageKnown().split(",")));
		
		return "thymeleaf/resumeTemplate";
	}
	
	@GetMapping("/preview/pdf")
	public ResponseEntity<?> getPDF(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException { 

		/* Do Business Logic */

		Object resumeTemplatedetails = resumeTemplateEntity;
		
		/* Create HTML using Thymeleaf template Engine */

		WebContext context = new WebContext(request, response, servletContext);
		context.setVariable("resumeTemplateEntity", resumeTemplatedetails);
		context.setVariable("skillsset", Arrays.asList(educationalDetails.get().getTechnicalSkills().split(",")));
		context.setVariable("languages", Arrays.asList(personalDetails.getLanguageKnown().split(",")));
		
		String resumeHtml = templateEngine.process("thymeleaf/resumeTemplate", context);

		/* Setup Source and target I/O streams */

		ByteArrayOutputStream target = new ByteArrayOutputStream();
		ConverterProperties converterProperties = new ConverterProperties();
		converterProperties.setBaseUri("http://localhost:8090");

		/* Call convert method */
		HtmlConverter.convertToPdf(resumeHtml, target, converterProperties);

		/* extract output as bytes */
		byte[] bytes = target.toByteArray();

		/* Send the response as downloadable PDF */

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename= "+userFullName+".pdf")
				.contentType(MediaType.APPLICATION_PDF).body(bytes);

	}

}
