package com.tmdt.domain;

/**
 * <p>
 * Domain class cho table LOAI_KHOA_HOC
 * </p>
 * 
 * @author ttlang
 *
 */
public class CourseType {
	private String courseTypeID;
	private String courseTitle;
	private String courseTile;

	public CourseType(String courseTypeID, String courseTitle, String courseTile) {
		super();
		this.courseTypeID = courseTypeID;
		this.courseTitle = courseTitle;
		this.courseTile = courseTile;
	}

	public CourseType() {
	}

	public String getCourseTypeID() {
		return courseTypeID;
	}

	public void setCourseTypeID(String courseTypeID) {
		this.courseTypeID = courseTypeID;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseTile() {
		return courseTile;
	}

	public void setCourseTile(String courseTile) {
		this.courseTile = courseTile;
	}

	@Override
	public String toString() {
		return "CourseType [courseTypeID=" + courseTypeID + ", courseTitle=" + courseTitle + ", courseTile="
				+ courseTile + "]";
	}

}
