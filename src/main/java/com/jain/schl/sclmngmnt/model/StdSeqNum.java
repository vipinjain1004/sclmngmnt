package com.jain.schl.sclmngmnt.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "STD_SEQ_NUM")
public class StdSeqNum {
	@Id
	@Column(name = "std_seq_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long entSeqNum;
	@Column(name = "ent_tme")
	private Date entTime;

	public StdSeqNum() {

	}

	public StdSeqNum(Date date) {
		this.entTime = date;
	}

	public long getEntSeqNum() {
		return entSeqNum;
	}

	public void setEntSeqNum(long entSeqNum) {
		this.entSeqNum = entSeqNum;
	}

	public Date getEntTime() {
		return entTime;
	}

	public void setEntTime(Date entTime) {
		this.entTime = entTime;
	}

	@Override
	public String toString() {
		return "StdSeqNum [entSeqNum=" + entSeqNum + ", entTime=" + entTime + "]";
	}

}
