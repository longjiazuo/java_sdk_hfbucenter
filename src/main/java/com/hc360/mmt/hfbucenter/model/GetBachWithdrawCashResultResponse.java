package com.hc360.mmt.hfbucenter.model;

import java.util.List;

public class GetBachWithdrawCashResultResponse extends BasicResponse {

	private String cashBachId;// ���κţ���ʶ�ô����ֲ��������κ�
	private String zolBusinessId;// zol����ҵ���ҵ�����
	private List<CashBatchResult> cashBatchResult;

	public String getCashBachId() {
		return cashBachId;
	}

	public void setCashBachId(String cashBachId) {
		this.cashBachId = cashBachId;
	}

	public String getZolBusinessId() {
		return zolBusinessId;
	}

	public void setZolBusinessId(String zolBusinessId) {
		this.zolBusinessId = zolBusinessId;
	}

	public List<CashBatchResult> getCashBatchResult() {
		return cashBatchResult;
	}

	public void setCashBatchResult(List<CashBatchResult> cashBatchResult) {
		this.cashBatchResult = cashBatchResult;
	}
}
