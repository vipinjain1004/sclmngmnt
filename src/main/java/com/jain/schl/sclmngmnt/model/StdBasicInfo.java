package com.jain.schl.sclmngmnt.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name ="TO_SCLSIN")
@JsonPropertyOrder({"stdFstName","stdLstName","stdMidName","stDob" })
@JsonIgnoreProperties(value = { "stdDoJ" })
public class StdBasicInfo {
	
	@Column(name="std_id")
	@Id
	private String stdId;
	@JsonProperty(required = true)
	@NotBlank(message = "First Name is mandatory")
	@Column(name="fst_nme")
	private String stdFstName;
	@JsonProperty
	@Column(name="lst_nme")
	@NotBlank(message = "Last Name is mandatory")
	private String stdLstName;
	@JsonProperty
	@Column(name="mid_nme")
	private String stdMidName;
	@Column(name="std_dob")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date stdDob;
	@Column(name="std_doj")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	@JsonIgnore
	private Date stdDoJ;
	@Column(name="std_gen")
	@NotBlank(message = "Gender is mandatory")
	private String stdGen;
	
	public Date getStdDoJ() {
		return stdDoJ;
	}
	public void setStdDoJ(Date stdDoJ) {
		this.stdDoJ = stdDoJ;
	}
	public String getStdGen() {
		return stdGen;
	}
	public void setStdGen(String stdGen) {
		this.stdGen = stdGen;
	}
	public String getStdid() {
		return stdId;
	}
	public void setStdid(String stdId) {
		this.stdId = stdId;
	}
	public String getStdFstName() {
		return stdFstName;
	}
	public void setStdFstName(String stdFstName) {
		this.stdFstName = stdFstName;
	}
	public String getStdLstName() {
		return stdLstName;
	}
	public void setStdLstName(String stdLstName) {
		this.stdLstName = stdLstName;
	}
	public String getStdMidName() {
		return stdMidName;
	}
	public void setStdMidName(String stdMidName) {
		this.stdMidName = stdMidName;
	}

	public Date getStdDob() {
		return stdDob;
	}
	public void setStdDob(Date stdDob) {
		this.stdDob = stdDob;
	}
	@Override
	public String toString() {
		return "StudentInfo [stdid=" + stdId + ", stdFstName=" + stdFstName + ", stdLstName=" + stdLstName
				+ ", stdMidName=" + stdMidName + ", stdDob=" + stdDob + ", stdDoJ=" + stdDoJ + ", stdGen=" + stdGen
				+ "]";
	}

	
	
	

}
