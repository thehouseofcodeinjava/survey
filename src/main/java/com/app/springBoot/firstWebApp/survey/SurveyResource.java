package com.in28minutes.springBoot.firstWebApp.survey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyResource {
	
	@Autowired
	SurveyService surveyService;
	
	
	@GetMapping("/survey")
	public List<Survey> getSurvey() {
		return surveyService.getSurvey();
	}
	

}
