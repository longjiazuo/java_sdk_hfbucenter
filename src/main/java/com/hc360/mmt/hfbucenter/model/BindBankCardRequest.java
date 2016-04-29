package com.hc360.mmt.hfbucenter.model;

public class BindBankCardRequest extends BasicRequest{
	private String cardType; // 银行账户类型(对公对私)
	private String cardOwer; // 银行开户户名
	private String cardNumber; // 银行账号
	private String bankName; // 开户银行名称
	private String bankRegion; // 开户行所在地
	private String bankBranch; // 银行支行名称
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
