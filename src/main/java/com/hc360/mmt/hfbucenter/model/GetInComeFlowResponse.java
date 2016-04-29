package com.hc360.mmt.hfbucenter.model;

import java.util.List;

public class GetInComeFlowResponse extends BasicResponse {
	private List<IncomeFlow> inComeFlowList;

	public List<IncomeFlow> getInComeFlowList() {
		return inComeFlowList;
	}

	public void setInComeFlowList(List<IncomeFlow> inComeFlowList) {
		this.inComeFlowList = inComeFlowList;
	}

}
