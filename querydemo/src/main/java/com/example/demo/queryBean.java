package com.example.demo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="QM_Query")
public class queryBean implements Serializable{
	
public queryBean() {
		
	}
	
	@Id
	@GeneratedValue
	private long queryId;
	private String indusId;
	
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

	
	@Column(name = "CATEGORY")
	private String category ;
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

	
	
	
	private QueryDetail queryDetail;
	
	@Column(name = "SUBCATEGORY")
	private String subCategory ;
	
	
	@OneToOne(mappedBy = "quBean")	
	public QueryDetail getQueryDetail() {
		return queryDetail;
	}
	public void setQueryDetail(QueryDetail queryDetail) {
		this.queryDetail = queryDetail;
		
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
	public queryBean(long queryId, String indusId, String category, Date dateRaised, Long status, String empuserName,
			String lluserName, String assignedto, String lastUpdatedBy, Date lastUpdatedDateTime,
			String assigneddepartment, String queryType, String priority, String subCategory) {
		super();
		this.queryId = queryId;
		this.indusId = indusId;
		this.category = category;
		this.dateRaised = dateRaised;
		this.status = status;
		this.empuserName = empuserName;
		this.lluserName = lluserName;
		this.assignedto = assignedto;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDateTime = lastUpdatedDateTime;
		this.assigneddepartment = assigneddepartment;
		this.queryType = queryType;
		this.priority = priority;
		this.subCategory = subCategory;		
	}
	
	
	
	

}
