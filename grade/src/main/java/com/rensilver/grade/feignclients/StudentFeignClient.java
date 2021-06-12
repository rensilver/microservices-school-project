package com.rensilver.grade.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rensilver.grade.entities.StudentProfile;

@Component
@FeignClient(name = "student", path = "/studentprofiles")
public interface StudentFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<StudentProfile> findById(@PathVariable Long id);
}
