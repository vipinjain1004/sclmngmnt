package com.jain.schl.sclmngmnt.model;


import java.sql.Date;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name ="TO_SCLSIN")
@JsonPropertyOrder({"stdFstName","stdLstName","stdMidName","stDob" })
public class StudentInfo {
	
	@Column(name="std_id")
	@Id
	private String stdid;
	@JsonProperty
	@Column(name="fst_nme")
	private String stdFstName;
	@JsonProperty
	@Column(name="lst_nme")
	private String stdLstName;
	@JsonProperty
	@Column(name="mid_nme")
	private String stdMidName;
	
	@Column(name="std_dob")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date stdDob;
	
	@Column(name="std_doj")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date stdDoJ;
	@Column(name="std_gen")
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
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
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
		return "StudentInfo [stdid=" + stdid + ", stdFstName=" + stdFstName + ", stdLstName=" + stdLstName
				+ ", stdMidName=" + stdMidName + ", stdDob=" + stdDob + ", stdDoJ=" + stdDoJ + ", stdGen=" + stdGen
				+ "]";
	}

	
	
	

}
