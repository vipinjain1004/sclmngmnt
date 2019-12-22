package com.jain.schl.sclmngmnt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="to_sclpsl")
@XmlRootElement
public class StdPrvSclDetails extends StdAuditModel {

	public StdPrvSclDetails(){
		
	}
	public StdPrvSclDetails(String stdId){
		this.stdId = stdId;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "std_id")
	@Id
	@Size(max = 10, min = 10, message = "Student should be 10 character")
	private String stdId;
	
	@Column(name = "tc_ref")
	private String tcRef;
	
	@Temporal(TemporalType.DATE)
	@Column(name="tc_isu_dte")
	private Date tcIssueDte;

	@Column(name = "prv_cls")
	private int prvCls;
	
	@Column(name = "prv_scl")
	private String prvScl;

	@Column(name="std_add")
	private String stdAdd;
	
	@Column(name="city")
	private String city;

	@Column(name="distt")
	private String distt;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pin_cde") 
	private int pinCde;
	
	
	@Column(name="tc_img")
	@Lob
	private byte[] tcImg;
	
	@JoinColumn(name="std_id", nullable=false)
	@OneToOne(fetch = FetchType.LAZY, optional = false )
	@JsonIgnore
	private StdBasicInfo stdBasicInfo;
	
	

	/**
	 * @return the stdId
	 */
	public String getStdId() {
		return stdId;
	}

	/**
	 * @param stdId the stdId to set
	 */
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	/**
	 * @return the tcRef
	 */
	public String getTcRef() {
		return tcRef;
	}

	/**
	 * @param tcRef the tcRef to set
	 */
	public void setTcRef(String tcRef) {
		this.tcRef = tcRef;
	}

	/**
	 * @return the tcIssueDte
	 */
	public Date getTcIssueDte() {
		return tcIssueDte;
	}

	/**
	 * @param tcIssueDte the tcIssueDte to set
	 */
	public void setTcIssueDte(Date tcIssueDte) {
		this.tcIssueDte = tcIssueDte;
	}

	/**
	 * @return the prvCls
	 */
	public int getPrvCls() {
		return prvCls;
	}

	/**
	 * @param prvCls the prvCls to set
	 */
	public void setPrvCls(int prvCls) {
		this.prvCls = prvCls;
	}

	/**
	 * @return the prvScl
	 */
	public String getPrvScl() {
		return prvScl;
	}

	/**
	 * @param prvScl the prvScl to set
	 */
	public void setPrvScl(String prvScl) {
		this.prvScl = prvScl;
	}

	/**
	 * @return the stdAdd
	 */
	public String getStdAdd() {
		return stdAdd;
	}

	/**
	 * @param stdAdd the stdAdd to set
	 */
	public void setStdAdd(String stdAdd) {
		this.stdAdd = stdAdd;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the distt
	 */
	public String getDistt() {
		return distt;
	}

	/**
	 * @param distt the distt to set
	 */
	public void setDistt(String distt) {
		this.distt = distt;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pinCde
	 */
	public int getPinCde() {
		return pinCde;
	}

	/**
	 * @param pinCde the pinCde to set
	 */
	public void setPinCde(int pinCde) {
		this.pinCde = pinCde;
	}

	/**
	 * @return the tcImg
	 */
	public byte[] getTcImg() {
		return tcImg;
	}
	/**
	 * @param tcImg the tcImg to set
	 */
	public void setTcImg(byte[] tcImg) {
		this.tcImg = tcImg;
	}
	/**
	 * @return the stdBasicInfo
	 */
	public StdBasicInfo getStdBasicInfo() {
		return stdBasicInfo;
	}
	/**
	 * @param stdBasicInfo the stdBasicInfo to set
	 */
	public void setStdBasicInfo(StdBasicInfo stdBasicInfo) {
		this.stdBasicInfo = stdBasicInfo;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StdPrvSclDetails [stdId=" + stdId + ", tcRef=" + tcRef + ", tcIssueDte=" + tcIssueDte + ", prvCls="
				+ prvCls + ", prvScl=" + prvScl + ", stdAdd=" + stdAdd + ", city=" + city + ", distt=" + distt
				+ ", state=" + state + ", pinCde=" + pinCde + ", tcImg=" + tcImg + ", getCreatedAt()=" + getCreatedAt()
				+ ", getUpdatedAt()=" + getUpdatedAt() + "]";
	}
	

	
	
	
}
