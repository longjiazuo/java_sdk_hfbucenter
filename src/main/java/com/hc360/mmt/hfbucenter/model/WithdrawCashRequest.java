package com.hc360.mmt.hfbucenter.model;

import java.util.List;

public class WithdrawCashRequest extends BasicRequest {
	private List<Card> card;
	private String SMSCode;// 手机短信验证码
	private String zolBusinessId;// zol处理业务的业务编码
	private String cashBachId;// 批次号，标识该次提现操作的批次号
	private String codeKeyId;// 短信接口里面短信发送成功之后返回的唯一keyId
	private String clientToken;// 保证幂等性

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
