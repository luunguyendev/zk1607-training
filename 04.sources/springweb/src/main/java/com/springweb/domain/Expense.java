package com.springweb.domain;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Expense implements Serializable {
	
	private String purpose;
	private String statementNumber;
	private Date payFrom;
	private Date payTo;
	private String name;
	private String department;
	private String position;
	private String manager;
	private String ssn;
	private String employeeId;
	private String approveName;
	private String notes;
	
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getStatementNumber() {
		return statementNumber;
	}
	public void setStatementNumber(String statementNumber) {
		this.statementNumber = statementNumber;
	}
	public Date getPayFrom() {
		return payFrom;
	}
	public void setPayFrom(Date payFrom) {
		this.payFrom = payFrom;
	}
	public Date getPayTo() {
		return payTo;
	}
	public void setPayTo(Date payTo) {
		this.payTo = payTo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getApproveName() {
		return approveName;
	}
	public void setApproveName(String approveName) {
		this.approveName = approveName;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
