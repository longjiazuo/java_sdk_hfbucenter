package com.hc360.mmt.hfbucenter.model;

import java.util.List;

public class WithdrawCashRequest extends BasicRequest {
	private List<Card> card;
	private String SMSCode;// �ֻ�������֤��
	private String zolBusinessId;// zol����ҵ���ҵ�����
	private String cashBachId;// ���κţ���ʶ�ô����ֲ��������κ�
	private String codeKeyId;// ���Žӿ�������ŷ��ͳɹ�֮�󷵻ص�ΨһkeyId
	private String clientToken;// ��֤�ݵ���

	public String getSMSCode() {
		return SMSCode;
	}

	public void setSMSCode(String sMSCode) {
		SMSCode = sMSCode;
	}

	public String getZolBusinessId() {
		return zolBusinessId;
	}

	public void setZolBusinessId(String zolBusinessId) {
		this.zolBusinessId = zolBusinessId;
	}

	public String getCashBachId() {
		return cashBachId;
	}

	public void setCashBachId(String cashBachId) {
		this.cashBachId = cashBachId;
	}

	public String getCodeKeyId() {
		return codeKeyId;
	}

	public void setCodeKeyId(String codeKeyId) {
		this.codeKeyId = codeKeyId;
	}

	public String getClientToken() {
		return clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
	}

	public List<Card> getCard() {
		return card;
	}

	public void setCard(List<Card> card) {
		this.card = card;
	}
}
