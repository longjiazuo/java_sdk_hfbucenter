package com.hc360.mmt.hfbucenter.client;

import java.io.IOException;

import com.hc360.mmt.hfbucenter.model.BindBankCardRequest;
import com.hc360.mmt.hfbucenter.model.BindBankCardResponse;
import com.hc360.mmt.hfbucenter.model.GetBachWithdrawCashResultRequest;
import com.hc360.mmt.hfbucenter.model.GetBachWithdrawCashResultResponse;
import com.hc360.mmt.hfbucenter.model.GetInComeFlowRequest;
import com.hc360.mmt.hfbucenter.model.GetInComeFlowResponse;
import com.hc360.mmt.hfbucenter.model.GetOutComeFlowRequest;
import com.hc360.mmt.hfbucenter.model.GetOutComeFlowResponse;
import com.hc360.mmt.hfbucenter.model.QueryHfbBalanceRequest;
import com.hc360.mmt.hfbucenter.model.QueryHfbBalanceResponse;
import com.hc360.mmt.hfbucenter.model.SendSMSRequest;
import com.hc360.mmt.hfbucenter.model.SendSMSResponse;
import com.hc360.mmt.hfbucenter.model.WithdrawCashRequest;
import com.hc360.mmt.hfbucenter.model.WithdrawCashResponse;

public interface AbstarctClient {
	public BindBankCardResponse execute(BindBankCardRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException;

	public QueryHfbBalanceResponse execute(QueryHfbBalanceRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException;

	public SendSMSResponse execute(SendSMSRequest request) throws IOException,
			ClassNotFoundException, InstantiationException,
			IllegalAccessException;

	public WithdrawCashResponse execute(WithdrawCashRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException;

	public GetBachWithdrawCashResultResponse execute(
			GetBachWithdrawCashResultRequest request) throws IOException,
			ClassNotFoundException, InstantiationException,
			IllegalAccessException;

	public GetInComeFlowResponse execute(GetInComeFlowRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException;

	public GetOutComeFlowResponse execute(GetOutComeFlowRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException;
}
