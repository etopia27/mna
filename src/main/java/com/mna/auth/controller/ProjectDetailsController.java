package com.mna.auth.controller;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mna.dataCarrier.dto.ProjectDetailsDTO;

@RestController
@RequestMapping(value = "/project", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProjectDetailsController {

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProjectDetailsDTO> getProjectaData() {

		List<ProjectDetailsDTO> list = new ArrayList<>();
		list.add(new ProjectDetailsDTO("project1", "Saurabh","2017-09-07","Asia"));
		list.add(new ProjectDetailsDTO("project2", "Rakesh","2017-08-27","Asia"));
		list.add(new ProjectDetailsDTO("project3", "Peter","2017-06-07","America"));
		list.add(new ProjectDetailsDTO("project4", "Mark","2017-09-21","America"));
		list.add(new ProjectDetailsDTO("project5", "Stas","2017-09-07","Europe"));
		list.add(new ProjectDetailsDTO("project6", "Joy","2017-09-07","Europe"));
		return list;

	}
	
	@RequestMapping(value = "/editProject", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public void editProject() {

		

	}
}
