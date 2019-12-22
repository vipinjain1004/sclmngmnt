package com.jain.schl.sclmngmnt.model;


import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name ="TO_SCLSIN")
@JsonPropertyOrder({"stdId","stdFstName","stdMidName","stdLstName","stDob" })
@JsonIgnoreProperties(value = { "stdDoJ" })
@XmlRootElement
public class StdBasicInfo {
	
	
	@Column(name="std_id")
	@Id
	@Size(max=10,min=10, message ="Student should be 10 character")
	private String stdId;
	
	@JsonProperty(required = true)
	@NotBlank(message = "First Name is mandatory field")
	@Column(name="fst_nme")
	private String stdFstName;
	
	@JsonProperty(required = true)
	@Column(name="lst_nme")
	@NotBlank(message = "Last Name is mandatory field")
	private String stdLstName;
	
	
	@Column(name="mid_nme")
	private String stdMidName;
	
	@JsonProperty(required = true)
	@Column(name="std_dob")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MMM-yyyy")
	private Date stdDob;
	
	@Column(name="std_doj")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MMM-yyyy")
	@JsonIgnore
	private Date stdDoJ;
	
	@JsonProperty(required = true)
	@Column(name="std_gen")
	@NotBlank(message = "Gender is mandatory field")
	private String stdGen;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="stdBasicInfo")
	private StdDetailsInfo stdDetailsInfo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="stdBasicInfo")
	private Set<StdClassDetails> stdClassDetails = new HashSet<>();
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="stdBasicInfo")
	private StdPrvSclDetails stdPrvSclDetails;
	
	
	/**
	 * @return the stdPrvSclDetails
	 */
	public StdPrvSclDetails getStdPrvSclDetails() {
		return stdPrvSclDetails;
	}
	/**
	 * @param stdPrvSclDetails the stdPrvSclDetails to set
	 */
	public void setStdPrvSclDetails(StdPrvSclDetails stdPrvSclDetails) {
		this.stdPrvSclDetails = stdPrvSclDetails;
	}
	/**
	 * @return the stdClassDetails
	 */
	public Set<StdClassDetails> getStdClassDetails() {
		return stdClassDetails;
	}
	/**
	 * @param stdClassDetails the stdClassDetails to set
	 */
	public void setStdClassDetails(Set<StdClassDetails> stdClassDetails) {
		this.stdClassDetails = stdClassDetails;
	}
	public StdDetailsInfo getStdDetailsInfo() {
		return stdDetailsInfo;
	}
	public void setStdDetailsInfo(StdDetailsInfo stdDetailsInfo) {
		this.stdDetailsInfo = stdDetailsInfo;
	}
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}	
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StdBasicInfo [stdId=" + stdId + ", stdFstName=" + stdFstName + ", stdLstName=" + stdLstName
				+ ", stdMidName=" + stdMidName + ", stdDob=" + stdDob + ", stdDoJ=" + stdDoJ + ", stdGen=" + stdGen
				+ ", stdDetailsInfo=" + stdDetailsInfo + ", stdClassDetails=" + stdClassDetails + "]";
	}

	
}
