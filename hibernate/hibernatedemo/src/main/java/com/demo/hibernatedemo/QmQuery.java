package com.demo.hibernatedemo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity	
@Table(name ="Qm_Query")
public class QmQuery  implements Serializable {
	
	@Id
	private long queryId;	
	private String indusId;
	private String category;
	

	@Column(name = "DATERAISED")
	private Date dateRaised; 
	@Column(name = "STATUS")
	private Long status ;
	
	@Column(name = "EMPUSERNAME")
	private String empuserName;
	
	@Column(name = "LLUSERNAME")
	private String lluserName  ;
	
	@Column(name = "ASSIGNEDTO")
	private String assignedto ;
	
	@Column(name = "LASTUPDATEDBY")
	private String lastUpdatedBy;
	@Column(name = "LASTUPDATEDDATETIME")
	private Date lastUpdatedDateTime ;

	@Column(name = "ASSIGNEDDEPARTMENT")
	private String assigneddepartment;
	
	@Column(name = "QUERYTYPE")
	private String queryType;
	
	@Column(name = "PRIORITY" ,columnDefinition="int default 0" )
	private String priority; 	
	
	
	@Column(name = "SUBCATEGORY")
	private String subCategory ;
	
	@OneToOne
	private QmQueryDetails qmQueryDetails;
	
	public long getQueryId() {
		return queryId;
	}
	public void setQueryId(long queryId) {
		this.queryId = queryId;
	}
	public String getIndusId() {
		return indusId;
	}
	public void setIndusId(String indusId) {
		this.indusId = indusId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	public Date getDateRaised() {
		return dateRaised;
	}
	public void setDateRaised(Date dateRaised) {
		this.dateRaised = dateRaised;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	public String getEmpuserName() {
		return empuserName;
	}
	public void setEmpuserName(String empuserName) {
		this.empuserName = empuserName;
	}
	public String getLluserName() {
		return lluserName;
	}
	public void setLluserName(String lluserName) {
		this.lluserName = lluserName;
	}
	public String getAssignedto() {
		return assignedto;
	}
	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Date getLastUpdatedDateTime() {
		return lastUpdatedDateTime;
	}
	public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}
	public String getAssigneddepartment() {
		return assigneddepartment;
	}
	public void setAssigneddepartment(String assigneddepartment) {
		this.assigneddepartment = assigneddepartment;
	}
	public String getQueryType() {
		return queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public QmQueryDetails getQmQueryDetails() {
		return qmQueryDetails;
	}
	public void setQmQueryDetails(QmQueryDetails qmQueryDetails) {
		this.qmQueryDetails = qmQueryDetails;
	}
	@Override
	public String toString() {
		return "QmQuery [queryId=" + queryId + ", indusId=" + indusId + ", category=" + category + ", dateRaised="
				+ dateRaised + ", status=" + status + ", empuserName=" + empuserName + ", lluserName=" + lluserName
				+ ", assignedto=" + assignedto + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDateTime="
				+ lastUpdatedDateTime + ", assigneddepartment=" + assigneddepartment + ", queryType=" + queryType
				+ ", priority=" + priority + ", subCategory=" + subCategory + "]";
	}
	

	
	
}
