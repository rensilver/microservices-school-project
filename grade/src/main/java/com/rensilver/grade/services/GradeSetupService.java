package com.rensilver.grade.services;

import org.springframework.stereotype.Service;

import com.rensilver.grade.entities.GradeSetup;

@Service
public class GradeSetupService {
	
	public GradeSetup getFinalGrade(long studentId, int schoolTerms) {
		return new GradeSetup("Paulo", "Silva", 2015, 31.0, 4);
	}
}
