package com.demo.hibernatedemo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.service.ServiceRegistry;

@Entity
@Table(name ="Qm_QueryDetails")
public class QmQueryDetails implements Serializable{
	
	

private long queryId;
@Id
private long queryDetailId;
private String details;
private String empUsername;                              
private String llUsername  ;
private Date lastUpdatedDateTime ;

private String assignedTo;
private String callFromType;
private String callFromName;
private String callFromNumber;

public long getQueryId() {
	return queryId;
}
public void setQueryId(long queryId) {
	this.queryId = queryId;
}
public long getQueryDetailId() {
	return queryDetailId;
}
public void setQueryDetailId(long queryDetailId) {
	this.queryDetailId = queryDetailId;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public String getEmpUsername() {
	return empUsername;
}
public void setEmpUsername(String empUsername) {
	this.empUsername = empUsername;
}
public String getLlUsername() {
	return llUsername;
}
public void setLlUsername(String llUsername) {
	this.llUsername = llUsername;
}
public Date getLastUpdatedDateTime() {
	return lastUpdatedDateTime;
}
public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
	this.lastUpdatedDateTime = lastUpdatedDateTime;
}
public String getAssignedTo() {
	return assignedTo;
}
public void setAssignedTo(String assignedTo) {
	this.assignedTo = assignedTo;
}
public String getCallFromType() {
	return callFromType;
}
public void setCallFromType(String callFromType) {
	this.callFromType = callFromType;
}
public String getCallFromName() {
	return callFromName;
}
public void setCallFromName(String callFromName) {
	this.callFromName = callFromName;
}
public String getCallFromNumber() {
	return callFromNumber;
}
public void setCallFromNumber(String callFromNumber) {
	this.callFromNumber = callFromNumber;
}





}
