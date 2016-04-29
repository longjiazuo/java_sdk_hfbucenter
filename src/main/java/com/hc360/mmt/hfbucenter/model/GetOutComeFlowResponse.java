package com.hc360.mmt.hfbucenter.model;

import java.util.List;

public class GetOutComeFlowResponse extends BasicResponse{
	private List<OutcomeFlow> outComeFlowList;

	public List<OutcomeFlow> getOutComeFlowList() {
		return outComeFlowList;
	}

	public void setOutComeFlowList(List<OutcomeFlow> outComeFlowList) {
		this.outComeFlowList = outComeFlowList;
	}
	
}
