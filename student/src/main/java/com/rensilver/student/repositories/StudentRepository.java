package com.rensilver.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rensilver.student.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
