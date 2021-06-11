package com.rensilver.grade.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rensilver.grade.entities.GradeSetup;
import com.rensilver.grade.services.GradeSetupService;

@RestController
@RequestMapping(value = "/grades")
public class GradeSetupController {
	
	@Autowired
	private GradeSetupService gradeSetupService;
	
	@GetMapping(value = "/{studentId}/schoolterms/{schoolTerms}")
	public ResponseEntity<GradeSetup> getFinalGrade(@PathVariable Long studentId, @PathVariable Integer schoolTerms) {
		GradeSetup gradeSetup = gradeSetupService.getFinalGrade(studentId, schoolTerms);
		return ResponseEntity.ok(gradeSetup);
	}
}
