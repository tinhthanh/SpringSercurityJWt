package com.tmdt.domain;
/**
 * <p>Domain class cho table CHU_DE</p>
 * @author ttlang
 *
 */

import java.util.List;

public class Topic {
	private String topicID;
	private String topicName;
	private	String topicDescription;
	private Integer topicStatut;
	private List<Course>listOfCourse;
	public Topic(String topicID, String topicName, String topicDescription, Integer topicStatut,
			List<Course> listOfCourse) {
		super();
		this.topicID = topicID;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
		this.topicStatut = topicStatut;
		this.listOfCourse = listOfCourse;
	}
	public Topic() {
	}
	public String getTopicID() {
		return topicID;
	}
	public void setTopicID(String topicID) {
		this.topicID = topicID;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	public Integer getTopicStatut() {
		return topicStatut;
	}
	public void setTopicStatut(Integer topicStatut) {
		this.topicStatut = topicStatut;
	}
	public List<Course> getListOfCourse() {
		return listOfCourse;
	}
	public void setListOfCourse(List<Course> listOfCourse) {
		this.listOfCourse = listOfCourse;
	}
	@Override
	public String toString() {
		return "Topic [topicID=" + topicID + ", topicName=" + topicName + ", topicDescription=" + topicDescription
				+ ", topicStatut=" + topicStatut + ", listOfCourse=" + listOfCourse + "]";
	}
	
	
	
	
	

}
