package com.hc360.mmt.hfbucenter.model;

public class SendSMSRequest extends BasicRequest{
	private String phoneNumber;// �ֻ�����

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
