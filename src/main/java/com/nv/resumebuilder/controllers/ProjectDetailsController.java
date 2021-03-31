package com.nv.resumebuilder.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nv.resumebuilder.entity.ExperienceDetailsEntity;
import com.nv.resumebuilder.entity.ProjectDetailsEntity;
import com.nv.resumebuilder.service.ExperienceDetailService;
import com.nv.resumebuilder.service.ProjectService;

@RestController
@CrossOrigin
public class ProjectDetailsController {

	private ProjectService projectService;
	private ExperienceDetailService experienceDetailService;

	@Autowired
	public ProjectDetailsController(ProjectService theProjectService,
			ExperienceDetailService theExperienceDetailService) {
		this.projectService = theProjectService;
		this.experienceDetailService = theExperienceDetailService;
	}

	@PostMapping("/newprojectDetails")
	public void login(@RequestBody HashMap<String, String> theExperienceProject, HttpServletResponse response) {

		/*
		 * These Constant Variable(DETECT_PROJECTDETAILS & DETECT_PROJECTNAME) are going
		 * to detect the project details and project name from hashmap(json) or data
		 * give by client side.
		 */
		String DETECT_PROJECTNAME = "pn";
		String DETECT_PROJECTDETAILS = "pd";

		Optional<ExperienceDetailsEntity>  experienceDetail = null;

		HashMap<String, String> projectDetails = theExperienceProject;

		ArrayList<ProjectDetailsEntity> projects = new ArrayList<ProjectDetailsEntity>();

		if (projectDetails.containsKey("custId")) {
//			int id = Integer.parseInt(projectDetails.get("custId"));
			Long id = Long.parseLong(projectDetails.get("custId"));
			experienceDetail = experienceDetailService.findById(id);
			for (int i = 1; i <= projectDetails.size() / 2; i++) {
				String keyName = null;
				ProjectDetailsEntity project = new ProjectDetailsEntity();
				project.setExperienceDetail(experienceDetail.get());
				for (String key : projectDetails.keySet()) {
					if (key.contains(String.valueOf(i))) {
						keyName = key;
						if (key.contains(String.valueOf(DETECT_PROJECTDETAILS))) {
							project.setProjectDescription(projectDetails.get(keyName));
						}
						if (key.contains(String.valueOf(DETECT_PROJECTNAME))) {
							project.setProjectName(projectDetails.get(keyName));
						}
						projects.add(project);
					}
				}
			}
		}

		experienceDetail.get().setProjects(projects);
		for (int i = 0; i < projects.size(); i++) {
			this.projectService.save(projects.get(i));
		}

	}
}