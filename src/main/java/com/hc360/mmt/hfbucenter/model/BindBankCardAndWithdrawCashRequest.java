package com.hc360.mmt.hfbucenter.model;

public class BindBankCardAndWithdrawCashRequest extends BasicRequest {
	private String cardNumber; // 银行账号
	private String cardType; // 银行账户类型(对公对私)
	private String cardOwer; // 银行开户户名
	private String bankName; // 开户银行名称
	private String bankRegion; // 开户行所在地
	private String bankBranch; // 银行支行名称
	private String cash;// 提现金额
	private String SMSCode;// 手机短信验证码
	private String codeKeyId;// 短信接口里面短信发送成功之后返回的唯一keyId
	private String businessId;// 业务编码
	private String cashBachId;// 批次号，标识该次提现操作的批次号，值唯一。
	private String callbackUrl;// 回调接口地址
	private String clientToken;// 用于保证幂等性

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

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

	public String getCash() {
		return cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}

	public String getSMSCode() {
		return SMSCode;
	}

	public void setSMSCode(String sMSCode) {
		SMSCode = sMSCode;
	}

	public String getCodeKeyId() {
		return codeKeyId;
	}

	public void setCodeKeyId(String codeKeyId) {
		this.codeKeyId = codeKeyId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getCashBachId() {
		return cashBachId;
	}

	public void setCashBachId(String cashBachId) {
		this.cashBachId = cashBachId;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getClientToken() {
		return clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}

}
