package org.boot.activiti.poc.activiti_poc_boot;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class RequestRep {

	private String requestId;
	private String requestName;
	private Date requestTime;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = new Date();
	}

}
