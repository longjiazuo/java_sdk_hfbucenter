package com.hc360.mmt.hfbucenter.model;

public class QueryHfbBalanceResponse extends BasicResponse{
	private String hfbCode;
	private String money;
	private String ableMoney;

	public String getHfbCode() {
		return hfbCode;
	}

	public void setHfbCode(String hfbCode) {
		this.hfbCode = hfbCode;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getAbleMoney() {
		return ableMoney;
	}

	public void setAbleMoney(String ableMoney) {
		this.ableMoney = ableMoney;
	}
}
