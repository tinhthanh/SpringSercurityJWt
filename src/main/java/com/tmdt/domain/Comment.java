package com.tmdt.domain;

import java.time.OffsetDateTime;

/**
 * <p>
 * Domain class cho table BINH_LUAN
 * </p>
 * 
 * @author ttlang
 *
 */
public class Comment {
	private String commentID;
	private String courseID;
	private User userCommment;
	private String commentContent;
	private OffsetDateTime commentDate;
	private Integer commentStatut;

	public Comment(String commentID, String courseID, User userCommment, String commentContent,
			OffsetDateTime commentDate, Integer commentStatut) {
		super();
		this.commentID = commentID;
		this.courseID = courseID;
		this.userCommment = userCommment;
		this.commentContent = commentContent;
		this.commentDate = commentDate;
		this.commentStatut = commentStatut;
	}

	public Comment() {
	}

	public String getCommentID() {
		return commentID;
	}

	public void setCommentID(String commentID) {
		this.commentID = commentID;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public User getUserCommment() {
		return userCommment;
	}

	public void setUserCommment(User userCommment) {
		this.userCommment = userCommment;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public OffsetDateTime getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(OffsetDateTime commentDate) {
		this.commentDate = commentDate;
	}

	public Integer getCommentStatut() {
		return commentStatut;
	}

	public void setCommentStatut(Integer commentStatut) {
		this.commentStatut = commentStatut;
	}

	@Override
	public String toString() {
		return "Comment [commentID=" + commentID + ", courseID=" + courseID + ", userCommment=" + userCommment
				+ ", commentContent=" + commentContent + ", commentDate=" + commentDate + ", commentStatut="
				+ commentStatut + "]";
	}

}
