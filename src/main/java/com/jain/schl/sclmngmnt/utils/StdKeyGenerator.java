package com.jain.schl.sclmngmnt.utils;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.jain.schl.sclmngmnt.model.StdSeqNum;
import com.jain.schl.sclmngmnt.service.StdSeqNumService;
import com.jain.schl.sclmngmnt.serviceImp.StdSeqNumServiceImp;

public class StdKeyGenerator implements IdentifierGenerator {

	@Autowired
	StdSeqNumServiceImp stdSeqNumServiceImp;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "STD";
		try {
			StdSeqNum stdSeqNum = new StdSeqNum();
			stdSeqNum.setEntTime(new java.sql.Date(new Date().getTime()));
			stdSeqNum = stdSeqNumServiceImp.addSequenceNum(stdSeqNum);

			String generatedId = prefix + stdSeqNum.getEntSeqNum();
			System.out.println("Generate key " + generatedId);
			return generatedId;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}