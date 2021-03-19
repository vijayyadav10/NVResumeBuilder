package com.nv.resumebuilder.controllers;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nv.resumebuilder.entity.PersonalDetailsEntity;
import com.nv.resumebuilder.repository.AchievementsAndHonoursRepository;
import com.nv.resumebuilder.repository.EducationalDetailsRepository;
import com.nv.resumebuilder.repository.ExperienceDetailRepository;
import com.nv.resumebuilder.repository.OrganizationalDetailsRepository;
import com.nv.resumebuilder.repository.ProjectRepository;
import com.nv.resumebuilder.repository.RefernceDetailsRepository;
import com.nv.resumebuilder.service.PersonalDetailsServices;

@Controller
public class ResumeTemplateController {
@Autowired
private PersonalDetailsServices personalDetailsServices;
@Autowired
public EducationalDetailsRepository educationalDetailsRepository;

@Autowired
public OrganizationalDetailsRepository organizationalDetailsRepository;

@Autowired
public ExperienceDetailRepository experienceDetailRepository;

@Autowired
public ProjectRepository projectRepository;

@Autowired
public RefernceDetailsRepository refernceDetailsRepository;

@Autowired
public AchievementsAndHonoursRepository achievementsAndHonoursRepository;

@GetMapping("/preview")
private String downloadResume(HttpSession session, Model model) {
// personal details
Long idAttribute = (Long) session.getAttribute("id");
PersonalDetailsEntity personalDetails = null;

if (idAttribute == null) {
return "redirect:/personalDetails";
} else {
personalDetails = this.personalDetailsServices.findById(idAttribute);

model.addAttribute("personalDetails", personalDetails);

// Education details
Optional<Object> educationalDetails = Optional
.ofNullable(educationalDetailsRepository.findByPersonId(idAttribute));

if (!educationalDetails.isPresent()) {
System.out.println("educationalDetails +++++ ispresent");
return "redirect:/education";
}
System.out.println(educationalDetails.get());
model.addAttribute("educationalDetails", educationalDetails.get());

// experience
Optional<Object> experienceDetails = Optional
.ofNullable(experienceDetailRepository.findByperson_id(idAttribute));

if (!experienceDetails.isPresent()) {
System.out.println("experienceDetails +++++ ispresent");
return "redirect:/experienceDetailForm";
}

model.addAttribute("experienceDetails", experienceDetails.get());
System.out.println(experienceDetails.get());

// organization details
Optional<Object> organizationalDetails = Optional
.ofNullable(organizationalDetailsRepository.findBypersonid(idAttribute));

if (!organizationalDetails.isPresent()) {
System.out.println("organizationalDetails +++++ ispresent");
return "redirect:/organizationaldetailsform";
}
System.out.println(organizationalDetails.get());

model.addAttribute("organizationalDetails", organizationalDetails.get());

// Achievements
Optional<Object> achievementsAndHonours = Optional
.ofNullable(achievementsAndHonoursRepository.findByPersonId(idAttribute));

if (!achievementsAndHonours.isPresent()) {
System.out.println("achievementsAndHonours +++++ ispresent");
return "redirect:/AchievementsForm";
}
System.out.println(achievementsAndHonours.get());
model.addAttribute("achievementsAndHonours", achievementsAndHonours.get());

// project
Optional<Object> projectDetails = Optional.ofNullable(projectRepository.findAllById(idAttribute));

if (!experienceDetails.isPresent()) {
System.out.println("experienceDetails +++++ ispresent");
return "redirect:/experienceDetail";
}
System.out.println(projectDetails.get());
model.addAttribute("projectDetails", projectDetails.get());

// reference
Optional<Object> refernceDetailsdata = Optional
.ofNullable(refernceDetailsRepository.findAllById(idAttribute));

if (!experienceDetails.isPresent()) {
return "redirect:/RefernceDetailsPage";
}
model.addAttribute("refernceDetailsdata", refernceDetailsdata.get());
System.out.println(refernceDetailsdata.get());
return "resumeFormet";
}
}

}



