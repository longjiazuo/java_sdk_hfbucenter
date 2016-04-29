package com.hc360.mmt.hfbucenter.model;

public class Card {
	private String cardKeyId;// 银行卡唯一识别码
	private String cash;// 提现金额

	public String getCardKeyId() {
		return cardKeyId;
	}

	public void setCardKeyId(String cardKeyId) {
		this.cardKeyId = cardKeyId;
	}

	public String getCash() {
		return cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}
}
