package com.hc360.mmt.hfbucenter.model;

public class BindBankCardRequest extends BasicRequest{
	private String cardType; // �����˻�����(�Թ���˽)
	private String cardOwer; // ���п�������
	private String cardNumber; // �����˺�
	private String bankName; // ������������
	private String bankRegion; // ���������ڵ�
	private String bankBranch; // ����֧������
	private String clientToken;

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardOwer() {
		return cardOwer;
	}

	public void setCardOwer(String cardOwer) {
		this.cardOwer = cardOwer;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankRegion() {
		return bankRegion;
	}

	public void setBankRegion(String bankRegion) {
		this.bankRegion = bankRegion;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getClientToken() {
		return clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}
}
