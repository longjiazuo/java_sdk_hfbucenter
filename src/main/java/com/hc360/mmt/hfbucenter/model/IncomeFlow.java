package com.hc360.mmt.hfbucenter.model;

public class IncomeFlow {
	private String order_code;
	private String flownumber;
	private String transaction_time;
	private String actual_money;

	public String getOrder_code() {
		return order_code;
	}

	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}

	public String getFlownumber() {
		return flownumber;
	}

	public void setFlownumber(String flownumber) {
		this.flownumber = flownumber;
	}

	public String getTransaction_time() {
		return transaction_time;
	}

	public void setTransaction_time(String transaction_time) {
		this.transaction_time = transaction_time;
	}

	public String getActual_money() {
		return actual_money;
	}

	public void setActual_money(String actual_money) {
		this.actual_money = actual_money;
	}
}
