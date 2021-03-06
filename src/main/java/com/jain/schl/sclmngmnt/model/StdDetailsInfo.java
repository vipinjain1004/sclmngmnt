package com.jain.schl.sclmngmnt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="to_SCLSDI")
@XmlRootElement
public class StdDetailsInfo {
	
	@Id
	@Column(name="std_id")
	@NotBlank(message = "Student id is mandatory")
	@Size(max=10,min=10, message ="Student should be 10 character")
	private String stdId;
	
	@Column(name="fth_fst_nme")
	private String fthFstNme;
	
	@Column(name="fth_lst_nme")
	private String fthLstNme;
	
	@Column(name="fth_mid_nme")
	private String fthMidNme;	
	
	@Column(name="mth_fst_nme")
	private String mthFstNme;
	
	@Column(name="mth_lst_nme")
	private String mthLstNme;
	
	@Column(name="mth_mid_nme")
	private String mthMidNme;
	
	@Column(name="mbl_num")
	private int mblNum;
	
	@Column(name="eml_id")
	@Email(message="Enter Valid Email id")
	private String emlId;
	
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
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "std_id", nullable = false)
	@JsonIgnore
    private StdBasicInfo stdBasicInfo;
	
	
	public StdDetailsInfo(){
		
	}
	public StdDetailsInfo(String stdId){
		this.stdId = stdId;
	}
	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getFthFstNme() {
		return fthFstNme;
	}

	public void setFthFstNme(String fthFstNme) {
		this.fthFstNme = fthFstNme;
	}

	public String getFthLstNme() {
		return fthLstNme;
	}

	public void setFthLstNme(String fthLstNme) {
		this.fthLstNme = fthLstNme;
	}

	public String getFthMidNme() {
		return fthMidNme;
	}

	public void setFthMidNme(String fthMidNme) {
		this.fthMidNme = fthMidNme;
	}

	public String getMthFstNme() {
		return mthFstNme;
	}

	public void setMthFstNme(String mthFstNme) {
		this.mthFstNme = mthFstNme;
	}

	public String getMthLstNme() {
		return mthLstNme;
	}

	public void setMthLstNme(String mthLstNme) {
		this.mthLstNme = mthLstNme;
	}

	public String getMthMidNme() {
		return mthMidNme;
	}

	public void setMthMidNme(String mthMidNme) {
		this.mthMidNme = mthMidNme;
	}

	public int getMblNum() {
		return mblNum;
	}

	public void setMblNum(int mblNum) {
		this.mblNum = mblNum;
	}

	public String getEmlId() {
		return emlId;
	}

	public void setEmlId(String emlId) {
		this.emlId = emlId;
	}

	public String getStdAdd() {
		return stdAdd;
	}

	public void setStdAdd(String stdAdd) {
		this.stdAdd = stdAdd;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistt() {
		return distt;
	}

	public void setDistt(String distt) {
		this.distt = distt;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCde() {
		return pinCde;
	}

	public void setPinCde(int pinCde) {
		this.pinCde = pinCde;
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
	@Override
	public String toString() {
		return "StdDetailsInfo [stdId=" + stdId + ", fthFstNme=" + fthFstNme + ", fthLstNme=" + fthLstNme
				+ ", fthMidNme=" + fthMidNme + ", mthFstNme=" + mthFstNme + ", mthLstNme=" + mthLstNme + ", mthMidNme="
				+ mthMidNme + ", mblNum=" + mblNum + ", emlId=" + emlId + ", stdAdd=" + stdAdd + ", city=" + city
				+ ", distt=" + distt + ", state=" + state + ", pinCde=" + pinCde + "]";
	}
	
	
}
