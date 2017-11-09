package com.tmdt.domain;

import java.time.OffsetDateTime;

/**
 * <p>
 * Domain class cho table NGUOI_DUNG
 * </p>
 * 
 * @author ttlang
 *
 */
public class User {
	private String userID;
	private String userName;
	private OffsetDateTime registrationDate;
	private String email;
	private String avatar;
	private String password;
	private Integer score;
	private Integer status;
	private String address;
	private String phoneNumber;

	public User(String userID, String userName, OffsetDateTime registrationDate, String email, String avatar,
			String password, Integer score, Integer status, String address, String phoneNumber) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.registrationDate = registrationDate;
		this.email = email;
		this.avatar = avatar;
		this.password = password;
		this.score = score;
		this.status = status;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public User(String userID, String userName, String email, String avatar) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.email = email;
		this.avatar = avatar;
	}


	public User() {
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public OffsetDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(OffsetDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", registrationDate=" + registrationDate
				+ ", email=" + email + ", avatar=" + avatar + ", password=" + password + ", score=" + score
				+ ", status=" + status + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

}
