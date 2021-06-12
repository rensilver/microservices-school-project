package com.rensilver.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rensilver.student.entities.StudentProfile;

@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long>{

}
