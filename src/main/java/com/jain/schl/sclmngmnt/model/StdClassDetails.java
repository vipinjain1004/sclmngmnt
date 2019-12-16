package com.jain.schl.sclmngmnt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TO_SCLSCL")
public class StdClassDetails extends StdAuditModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "std_id")
	@Id
	@Size(max = 10, min = 10, message = "Student should be 10 character")
	private String stdId;

	@Column(name = "std_cls")
	private int StdClassName;

	@Column(name = "ssl_ssn")
	private String sessionYear;

	@Temporal(TemporalType.DATE)
	@Column(name = "std_str_dte")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "std_end_dte")
	private Date endDate;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "std_id", nullable = false, insertable=false, updatable=false)
	@JsonIgnore
	private StdBasicInfo stdBasicInfo;

	public StdClassDetails() {

	}

	public StdClassDetails(String stdId) {
		this.stdId = stdId;
	}

	/**
	 * @return the stdBasicInfo
	 */
	public StdBasicInfo getStdBasicInfo() {
		return stdBasicInfo;
	}

	/**
	 * @param stdBasicInfo
	 *            the stdBasicInfo to set
	 */
	public void setStdBasicInfo(StdBasicInfo stdBasicInfo) {
		this.stdBasicInfo = stdBasicInfo;
	}

	/**
	 * @return the stdId
	 */
	public String getStdId() {
		return stdId;
	}

	/**
	 * @param stdId
	 *            the stdId to set
	 */
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	/**
	 * @return the stdClassName
	 */
	public int getStdClassName() {
		return StdClassName;
	}

	/**
	 * @param stdClassName the stdClassName to set
	 */
	public void setStdClassName(int stdClassName) {
		StdClassName = stdClassName;
	}

	/**
	 * @return the sessionYear
	 */
	public String getSessionYear() {
		return sessionYear;
	}

	/**
	 * @param sessionYear
	 *            the sessionYear to set
	 */
	public void setSessionYear(String sessionYear) {
		this.sessionYear = sessionYear;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StdClassDetails [stdId=" + stdId + ", StdClassName=" + StdClassName + ", sessionYear=" + sessionYear
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", stdBasicInfo=" + stdBasicInfo
				+ ", getCreatedAt()=" + getCreatedAt() + ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}



}
