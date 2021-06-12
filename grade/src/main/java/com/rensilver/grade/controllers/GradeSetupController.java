package com.rensilver.grade.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rensilver.grade.entities.GradeSetup;
import com.rensilver.grade.services.GradeSetupService;

@RestController
@RequestMapping(value = "/grades")
public class GradeSetupController {
	
	@Autowired
	private GradeSetupService gradeSetupService;
	
	@HystrixCommand(fallbackMethod = "getFinalGradeAlternative")
	@GetMapping(value = "/{studentProfileId}")
	public ResponseEntity<GradeSetup> getFinalGrade(@PathVariable Long studentProfileId) {
		GradeSetup gradeSetup = gradeSetupService.getFinalGrade(studentProfileId);
		return ResponseEntity.ok(gradeSetup);
	}
	
	public ResponseEntity<GradeSetup> getFinalGradeAlternative(Long studentProfileId) {
		GradeSetup gradeSetup = new GradeSetup("Mauro Goes", 35.0, 2020);
		return ResponseEntity.ok(gradeSetup);
	}
}
