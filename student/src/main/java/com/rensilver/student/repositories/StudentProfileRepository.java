package com.rensilver.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rensilver.student.entities.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long>{

}
