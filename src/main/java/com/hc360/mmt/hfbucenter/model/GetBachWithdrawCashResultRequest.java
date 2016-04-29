package com.hc360.mmt.hfbucenter.model;

public class GetBachWithdrawCashResultRequest extends BasicRequest{
	private String cashBachId; // 批次号，标识该次提现操作的批次号

	public String getCashBachId() {
		return cashBachId;
	}

	public void setCashBachId(String cashBachId) {
		this.cashBachId = cashBachId;
	}
}
