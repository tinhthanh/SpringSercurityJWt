package com.tmdt.domain;
/**
 * <p>Domain class cho table DINH_KEM_BAI_HOC</p>
 * @author ttlang
 *
 */

import java.time.OffsetDateTime;

public class LessonAttach {
	private String lessonAttachID;
	private String lessonID;
	private String lesonAttachContent;
	private OffsetDateTime dayAdded;
	public LessonAttach(String lessonAttachID, String lessonID, String lesonAttachContent, OffsetDateTime dayAdded) {
		super();
		this.lessonAttachID = lessonAttachID;
		this.lessonID = lessonID;
		this.lesonAttachContent = lesonAttachContent;
		this.dayAdded = dayAdded;
	}
	public LessonAttach() {
		super();
	}
	public String getLessonAttachID() {
		return lessonAttachID;
	}
	public void setLessonAttachID(String lessonAttachID) {
		this.lessonAttachID = lessonAttachID;
	}
	public String getLessonID() {
		return lessonID;
	}
	public void setLessonID(String lessonID) {
		this.lessonID = lessonID;
	}
	public String getLesonAttachContent() {
		return lesonAttachContent;
	}
	public void setLesonAttachContent(String lesonAttachContent) {
		this.lesonAttachContent = lesonAttachContent;
	}
	public OffsetDateTime getDayAdded() {
		return dayAdded;
	}
	public void setDayAdded(OffsetDateTime dayAdded) {
		this.dayAdded = dayAdded;
	}
	@Override
	public String toString() {
		return "LessonAttach [lessonAttachID=" + lessonAttachID + ", lessonID=" + lessonID + ", lesonAttachContent="
				+ lesonAttachContent + ", dayAdded=" + dayAdded + "]";
	}
	

	
}
