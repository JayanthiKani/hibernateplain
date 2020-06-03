package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="QM_Querydetails")
public class QueryDetail implements Serializable {

	
public QueryDetail() {
		
	}
private long queryId;
@Id
private long queryDetailId;
private String details;
@Column(name = "EMPUSERNAME")
private String empUsername; 
@Column(name = "LLUSERNAME")
private String llUsername  ;
@Column(name = "LASTUPDATEDDATETIME")
private Date lastUpdatedDateTime ;

private String assignedTo;
private String callFromType;
private String callFromName;
private String callFromNumber;


private queryBean quBean;

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




@OneToOne
public queryBean getQuBean() {
	return quBean;
}
public void setQuBean(queryBean quBean) {
	this.quBean = quBean;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (int) (queryDetailId ^ (queryDetailId >>> 32));
	result = prime * result + (int) (queryId ^ (queryId >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	QueryDetail other = (QueryDetail) obj;
	if (queryDetailId != other.queryDetailId)
		return false;
	if (queryId != other.queryId)
		return false;
	return true;
}


}
