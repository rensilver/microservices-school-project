package com.rensilver.grade.entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GradeSetup {

	private String studentFullName;
	private Double totalGrade;
	private Integer schoolYear;
	
	public GradeSetup() {
	}

	public GradeSetup(String studentFullName, Double totalGrade, Integer schoolYear) {
		this.studentFullName = studentFullName;
		this.totalGrade = totalGrade;
		this.schoolYear = schoolYear;
	}

	public String getStudentFullName() {
		return studentFullName;
	}

	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}

	public void setTotalGrade(Double totalGrade) {
		this.totalGrade = totalGrade;
	}
	
	public Integer getSchoolYear() {
		return schoolYear;
	}

	public void setSchoolYear(Integer schoolYear) {
		this.schoolYear = schoolYear;
	}
	
	public double getAverageGrade() {
		int schoolTerms = 4;
		double average = totalGrade / schoolTerms;
		BigDecimal bd = new BigDecimal(Double.toString(average));
		bd = bd.setScale(1, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
