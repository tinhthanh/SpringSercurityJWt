package com.tmdt.domain;
public class CourseDetail {
	private String courseID;
	private String detailedDescription;
	public CourseDetail(String courseID, String detailedDescription) {
		super();
		this.courseID = courseID;
		this.detailedDescription = detailedDescription;
	}
	
	public CourseDetail() {
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getDetailedDescription() {
		return detailedDescription;
	}

	public void setDetailedDescription(String detailedDescription) {
		this.detailedDescription = detailedDescription;
	}

	@Override
	public String toString() {
		return "CourseDetail [courseID=" + courseID + ", detailedDescription=" + detailedDescription + "]";
	}
	

}
