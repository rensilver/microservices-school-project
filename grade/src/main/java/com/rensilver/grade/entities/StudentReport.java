package com.rensilver.grade.entities;

import java.io.Serializable;

public class StudentReport implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Double firstBimester;
	private Double secondBimester;
	private Double thirdBimester;
	private Double fourthBimester;
	
	private StudentProfile studentProfile;
	
	public StudentReport() {
	}
	
	public StudentReport(Long id, Double firstBimester, Double secondBimester, Double thirdBimester,
			Double fourthBimester) {
		super();
		this.id = id;
		this.firstBimester = firstBimester;
		this.secondBimester = secondBimester;
		this.thirdBimester = thirdBimester;
		this.fourthBimester = fourthBimester;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getFirstBimester() {
		return firstBimester;
	}

	public void setFirstBimester(Double firstBimester) {
		this.firstBimester = firstBimester;
	}

	public Double getSecondBimester() {
		return secondBimester;
	}

	public void setSecondBimester(Double secondBimester) {
		this.secondBimester = secondBimester;
	}

	public Double getThirdBimester() {
		return thirdBimester;
	}

	public void setThirdBimester(Double thirdBimester) {
		this.thirdBimester = thirdBimester;
	}

	public Double getFourthBimester() {
		return fourthBimester;
	}

	public void setFourthBimester(Double fourthBimester) {
		this.fourthBimester = fourthBimester;
	}
	
	public Double getTotalGrade() {
		return firstBimester + secondBimester +
				thirdBimester + fourthBimester;
	}
}
