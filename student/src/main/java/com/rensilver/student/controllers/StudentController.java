package com.rensilver.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rensilver.student.entities.Student;
import com.rensilver.student.repositories.StudentRepository;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping
	public ResponseEntity<List<Student>> findAll() {
		List<Student> list = studentRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Student> findById(@PathVariable Long id) {
		Student student = studentRepository.findById(id).get();
		return ResponseEntity.ok(student);
	}
}
