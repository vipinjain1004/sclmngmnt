package com.jain.schl.sclmngmnt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "TO_SCLCONF")
@XmlRootElement
public class StdConfModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Size(max = 10, min = 10, message = "Student should be 10 character")
	private Long id;

	@JsonProperty(required = true)
	@Column(name = "Att_key")
	private String attKey;

	@JsonProperty(required = true)
	@Column(name = "Att_val")
	private String attVal;

	/**
	 * @return the id
	 */
	Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the attKey
	 */
	String getAttKey() {
		return attKey;
	}

	/**
	 * @param attKey
	 *            the attKey to set
	 */
	void setAttKey(String attKey) {
		this.attKey = attKey;
	}

	/**
	 * @return the attVal
	 */
	public String getAttVal() {
		return attVal;
	}

	/**
	 * @param attVal
	 *            the attVal to set
	 */
	void setAttVal(String attVal) {
		this.attVal = attVal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StdBasicInfo [id=" + id + ", attKey=" + attKey + ", attVal=" + attVal + "]";
	}
}
