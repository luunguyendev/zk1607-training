package com.springweb.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Customer
 * @author ntluu
 * @version 0.1
 * @since 2016-05-09
 * @modified: n/a
 */
@SuppressWarnings("serial")
public class Customer implements Serializable {
	
	private String customerId;
	private String customerNo;
	private String firstName;
	private String lastName;
	private Date dob;
	private Boolean gender;
	private String email;
	private String address;
	private String idCard;
	private String idPlace;
	private String idDate;
	private Date activeDate;
	private Date createdOn;
	private Timestamp modifiedOn;
	private Long updateCounter;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getIdPlace() {
		return idPlace;
	}
	public void setIdPlace(String idPlace) {
		this.idPlace = idPlace;
	}
	public String getIdDate() {
		return idDate;
	}
	public void setIdDate(String idDate) {
		this.idDate = idDate;
	}
	public Date getActiveDate() {
		return activeDate;
	}
	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Timestamp getModifiedOn() {
		return modifiedOn;
	}
	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	public Long getUpdateCounter() {
		return updateCounter;
	}
	public void setUpdateCounter(Long updateCounter) {
		this.updateCounter = updateCounter;
	}
}
