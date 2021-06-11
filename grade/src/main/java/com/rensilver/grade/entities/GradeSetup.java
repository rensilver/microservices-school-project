package com.rensilver.grade.entities;

public class GradeSetup {

	private String studentFirstName;
	private String studentLastName;
	private Integer year;
	private Double studentGrades;
	private Integer schoolTerms;
	
	public GradeSetup() {
	}

	public GradeSetup(String studentFirstName, String studentLastName, Integer year, Double studentGrades, Integer schoolTerms) {
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.year = year;
		this.studentGrades = studentGrades;
		this.schoolTerms = schoolTerms;
	}

	public String getStudenFirsttName() {
		return studentFirstName;
	}

	public void setStudenFirsttName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getStudentGrade() {
		return studentGrades;
	}

	public void setStudentGrade(Double studentGrades) {
		this.studentGrades = studentGrades;
	}

	public Integer getSchoolTerm() {
		return schoolTerms;
	}

	public void setSchoolTerm(Integer schoolTerms) {
		this.schoolTerms = schoolTerms;
	}
	
	public double getAverage() {
		return studentGrades / schoolTerms; 
	}
}
