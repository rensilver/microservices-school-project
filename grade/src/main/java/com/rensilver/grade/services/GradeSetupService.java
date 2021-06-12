package com.rensilver.grade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rensilver.grade.entities.GradeSetup;
import com.rensilver.grade.entities.StudentProfile;
import com.rensilver.grade.feignclients.StudentFeignClient;

@Service
public class GradeSetupService {
	
	@Autowired
	private StudentFeignClient studentFeignClient;
	
	public GradeSetup getFinalGrade(long studentProfileId) {
		
		StudentProfile studentProfile = studentFeignClient.findById(studentProfileId).getBody();
		return new GradeSetup(studentProfile.getFirstName() + " " + studentProfile.getLastName(), 
				studentProfile.getStudentReport().getTotalGrade(), 2020);
	}
}
