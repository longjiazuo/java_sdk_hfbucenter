package com.hc360.mmt.hfbucenter.model;

public class BindBankCardAndWithdrawCashRequest extends BasicRequest {
	private String cardNumber; // �����˺�
	private String cardType; // �����˻�����(�Թ���˽)
	private String cardOwer; // ���п�������
	private String bankName; // ������������
	private String bankRegion; // ���������ڵ�
	private String bankBranch; // ����֧������
	private String cash;// ���ֽ��
	private String SMSCode;// �ֻ�������֤��
	private String codeKeyId;// ���Žӿ�������ŷ��ͳɹ�֮�󷵻ص�ΨһkeyId
	private String businessId;// ҵ�����
	private String cashBachId;// ���κţ���ʶ�ô����ֲ��������κţ�ֵΨһ��
	private String callbackUrl;// �ص��ӿڵ�ַ
	private String clientToken;// ���ڱ�֤�ݵ���

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
