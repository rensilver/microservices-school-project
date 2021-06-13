package com.rensilver.student.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rensilver.student.entities.StudentProfile;
import com.rensilver.student.repositories.StudentProfileRepository;

@RefreshScope
@RestController
@RequestMapping(value = "/studentprofiles")
public class StudentProfileController {
	
	private static Logger logger = LoggerFactory.getLogger(StudentProfileController.class);
	
	@Value("${test.config}")
	private String testConfig;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private StudentProfileRepository studentProfileRepository;
	
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
		logger.info("CONFIG = " + testConfig);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	public ResponseEntity<List<StudentProfile>> findAll() {
		List<StudentProfile> list = studentProfileRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<StudentProfile> findById(@PathVariable Long id) {
		
		/*
		try {
		Thread.sleep(3000L);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
				
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		StudentProfile studentProfile = studentProfileRepository.findById(id).get();
		return ResponseEntity.ok(studentProfile);
	}
}
