package com.rensilver.grade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradeApplication.class, args);
	}

}
