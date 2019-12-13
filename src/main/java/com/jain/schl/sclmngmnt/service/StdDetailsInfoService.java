package com.jain.schl.sclmngmnt.service;

import com.jain.schl.sclmngmnt.model.StdDetailsInfo;

public interface StdDetailsInfoService {
	public StdDetailsInfo addStudentDetails(StdDetailsInfo stdDetailsInfo);
	public StdDetailsInfo findByStdId(String stdId);
	public StdDetailsInfo updateStudentDetails(StdDetailsInfo stdDetailsInfo);

}
