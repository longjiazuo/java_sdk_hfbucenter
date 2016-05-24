package com.hc360.mmt.hfbucenter.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hc360.mmt.hfbucenter.common.constants.ClientConstants;
import com.hc360.mmt.hfbucenter.common.util.DESedeUtils;
import com.hc360.mmt.hfbucenter.common.util.FastJSONUtil;
import com.hc360.mmt.hfbucenter.common.util.Signer;
import com.hc360.mmt.hfbucenter.common.util.http.HttpClient;
import com.hc360.mmt.hfbucenter.common.util.http.HttpClient.HttpResult;
import com.hc360.mmt.hfbucenter.common.util.https.HttpsClient;
import com.hc360.mmt.hfbucenter.error.ClientErrorCode;
import com.hc360.mmt.hfbucenter.exception.ClientException;
import com.hc360.mmt.hfbucenter.model.BasicRequest;
import com.hc360.mmt.hfbucenter.model.BasicResponse;
import com.hc360.mmt.hfbucenter.model.BindBankCardAndWithdrawCashRequest;
import com.hc360.mmt.hfbucenter.model.BindBankCardAndWithdrawCashResponse;
import com.hc360.mmt.hfbucenter.model.BindBankCardRequest;
import com.hc360.mmt.hfbucenter.model.BindBankCardResponse;
import com.hc360.mmt.hfbucenter.model.GetBachWithdrawCashResultRequest;
import com.hc360.mmt.hfbucenter.model.GetBachWithdrawCashResultResponse;
import com.hc360.mmt.hfbucenter.model.GetInComeFlowRequest;
import com.hc360.mmt.hfbucenter.model.GetInComeFlowResponse;
import com.hc360.mmt.hfbucenter.model.GetOutComeFlowRequest;
import com.hc360.mmt.hfbucenter.model.GetOutComeFlowResponse;
import com.hc360.mmt.hfbucenter.model.IncomeFlow;
import com.hc360.mmt.hfbucenter.model.OutcomeFlow;
import com.hc360.mmt.hfbucenter.model.QueryHfbBalanceRequest;
import com.hc360.mmt.hfbucenter.model.QueryHfbBalanceResponse;
import com.hc360.mmt.hfbucenter.model.SendSMSRequest;
import com.hc360.mmt.hfbucenter.model.SendSMSResponse;
import com.hc360.mmt.hfbucenter.model.WithdrawCashRequest;
import com.hc360.mmt.hfbucenter.model.WithdrawCashResponse;
import com.hc360.mmt.hfbucenter.msg.ClientRequest;

public class DefaultClient implements AbstarctClient {
	private String appKey;;
	private String appSecret;

	public void setAppKey(String key) {
		appKey = key;
	}

	public void setAppSecret(String secret) {
		appSecret = secret;
	}

	public DefaultClient() {
	}

	public DefaultClient(String appKey, String appSecret) {
		this.appKey = appKey;
		this.appSecret = appSecret;
	}

	/**
	 * BindBankCard API执行入口
	 * 
	 * @author longjiazuo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public BindBankCardResponse execute(BindBankCardRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		return execute(request, false);
	}

	/**
	 * BindBankCard重载方法
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param https
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private BindBankCardResponse execute(BindBankCardRequest request,
			boolean https) throws UnsupportedEncodingException {
		// 校验参数
		checkParam(request);
		BindBankCardResponse response = new BindBankCardResponse();
		JSONObject content = getResponse(request, response,
				ClientConstants.InterfaceParam.BIND_BANKCARD, https);
		if (content != null) {
			String returnResult = content
					.getString(ClientConstants.ApiParam.RESULT);
			String decryContent = this.decryptResult(returnResult);
			// 把json串转换成为javabean
			response = FastJSONUtil.parseObject(decryContent,
					BindBankCardResponse.class);
		}
		return response;
	}

	/**
	 * QueryHfbBalance API执行入口
	 * 
	 * @author longjiazuo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public QueryHfbBalanceResponse execute(QueryHfbBalanceRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		return execute(request, true);
	}

	/**
	 * QueryHfbBalance重载方法
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param https
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private QueryHfbBalanceResponse execute(QueryHfbBalanceRequest request,
			boolean https) throws IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		// 校验参数
		checkParam(request);
		QueryHfbBalanceResponse response = new QueryHfbBalanceResponse();
		JSONObject content = getResponse(request, response,
				ClientConstants.InterfaceParam.QUERY_HFBBALANCE, https);
		if (content != null) {
			String returnResult = content
					.getString(ClientConstants.ApiParam.RESULT);
			String decryContent = this.decryptResult(returnResult);
			// 把json串转换成为javabean
			response = FastJSONUtil.parseObject(decryContent,
					QueryHfbBalanceResponse.class);
		}
		return response;
	}

	/**
	 * SendSMS API执行入口
	 * 
	 * @author longjiazuo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public SendSMSResponse execute(SendSMSRequest request) throws IOException,
			ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		return execute(request, false);
	}

	/**
	 * SendSMS重载方法
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param https
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public SendSMSResponse execute(SendSMSRequest request, boolean https)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		// 校验参数
		checkParam(request);
		SendSMSResponse response = new SendSMSResponse();
		JSONObject content = getResponse(request, response,
				ClientConstants.InterfaceParam.SEND_SMS, https);
		if (content != null) {
			String returnResult = content
					.getString(ClientConstants.ApiParam.RESULT);
			String decryContent = this.decryptResult(returnResult);
			// 把json串转换成为javabean
			response = FastJSONUtil.parseObject(decryContent,
					SendSMSResponse.class);
		}
		return response;
	}

	/**
	 * WithdrawCash API执行入口
	 * 
	 * @author longjiazuo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public WithdrawCashResponse execute(WithdrawCashRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		return execute(request, false);
	}

	/**
	 * WithdrawCash方法重载
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param https
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private WithdrawCashResponse execute(WithdrawCashRequest request,
			boolean https) throws IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		// 校验参数
		checkParam(request);
		WithdrawCashResponse response = new WithdrawCashResponse();
		getResponse(request, response,
				ClientConstants.InterfaceParam.WITHDRAW_CASH, https);
		return response;
	}

	/**
	 * GetBachWithdrawCashResult API执行入口
	 * 
	 * @author longjiazuo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public GetBachWithdrawCashResultResponse execute(
			GetBachWithdrawCashResultRequest request) throws IOException,
			ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		return execute(request, false);
	}

	/**
	 * GetBachWithdrawCashResult方法重载
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param https
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private GetBachWithdrawCashResultResponse execute(
			GetBachWithdrawCashResultRequest request, boolean https)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		// 校验参数
		checkParam(request);
		GetBachWithdrawCashResultResponse response = new GetBachWithdrawCashResultResponse();
		JSONObject content = getResponse(request, response,
				ClientConstants.InterfaceParam.GET_BACHWITHDRAWCASHRESULT,
				https);
		if (content != null) {
			String returnResult = content
					.getString(ClientConstants.ApiParam.RESULT);
			String decryContent = this.decryptResult(returnResult);
			// 把json串转换成为javabean
			response = FastJSONUtil.parseObject(decryContent,
					GetBachWithdrawCashResultResponse.class);
		}
		return response;
	}

	/**
	 * GetInComeFlow API执行入口
	 * 
	 * @author longjiazuo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public GetInComeFlowResponse execute(GetInComeFlowRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		return execute(request, false);
	}

	/**
	 * GetInComeFlow方法重载
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param https
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private GetInComeFlowResponse execute(GetInComeFlowRequest request,
			boolean https) throws IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		// 校验参数
		checkParam(request);
		GetInComeFlowResponse response = new GetInComeFlowResponse();
		List<IncomeFlow> responseList = new ArrayList<IncomeFlow>();
		JSONObject content = getResponse(request, response,
				ClientConstants.InterfaceParam.GETINCOMEFLOW, https);
		if (content != null) {
			String returnResult = content
					.getString(ClientConstants.ApiParam.RESULT);
			String decryContent = this.decryptResult(returnResult);
			// 把json串转换成为javabean集合
			responseList = FastJSONUtil.parseArray(decryContent,
					IncomeFlow.class);
			response.setInComeFlowList(responseList);
		}
		return response;
	}

	/**
	 * GetOutComeFlow API执行入口
	 * 
	 * @author longjiazuo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public GetOutComeFlowResponse execute(GetOutComeFlowRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		return execute(request, false);
	}

	/**
	 * GetOutComeFlow方法重载
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param https
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private GetOutComeFlowResponse execute(GetOutComeFlowRequest request,
			boolean https) throws IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		// 校验参数
		checkParam(request);
		GetOutComeFlowResponse response = new GetOutComeFlowResponse();
		List<OutcomeFlow> responseList = new ArrayList<OutcomeFlow>();
		JSONObject content = getResponse(request, response,
				ClientConstants.InterfaceParam.GETOUTCOMEFLOW, https);
		if (content != null) {
			String returnResult = content
					.getString(ClientConstants.ApiParam.RESULT);
			String decryContent = this.decryptResult(returnResult);
			// 把json串转换成为javabean
			responseList = FastJSONUtil.parseArray(decryContent,
					OutcomeFlow.class);
			response.setOutComeFlowList(responseList);
		}
		return response;
	}

	/**
	 * bindCardAndWithdrawCash API执行入口
	 * 
	 * @author longjiazuo
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public BindBankCardAndWithdrawCashResponse execute(BindBankCardAndWithdrawCashRequest request)
			throws IOException, ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		return execute(request, false);
	}

	/**
	 * bindCardAndWithdrawCash方法重载
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param https
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private BindBankCardAndWithdrawCashResponse execute(BindBankCardAndWithdrawCashRequest request,
			boolean https) throws IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		// 校验参数
		checkParam(request);
		BindBankCardAndWithdrawCashResponse response = new BindBankCardAndWithdrawCashResponse();
		getResponse(request, response,
				ClientConstants.InterfaceParam.BIND_BANKCARDANDWITHDRAW_CASH, https);
		return response;
	}
	
	
	/**
	 * 校验参数
	 * 
	 * @author longjiazuo
	 * @param object
	 */
	private void checkParam(BasicRequest request) {
		if (request == null) {
			throw new ClientException(ClientErrorCode.PARAM_ARE_NULL);
		}
		if (appKey == null) {
			throw new ClientException(ClientErrorCode.APPKEY_ARE_NULL);
		}
		if (appSecret == null) {
			throw new ClientException(ClientErrorCode.APPSECRET_ARE_NULL);
		}
	}

	// 获取请求API域名地址
	private String getRequestMethodServerHost(boolean https) {
		String server_host = ClientConstants.HTTPS_SCHEME + "://"
				+ ClientConstants.InterfaceParam.SERVER_HOST;
		if (!https)
			server_host = ClientConstants.HTTP_SCHEME + "://"
					+ ClientConstants.InterfaceParam.SERVER_HOST;
		return server_host;
	}

	private HttpResult callAPI(String apiUrl, Map<String, Object> reqBody,
			boolean https) {
		// 调用https路径

		if (https)
			return callHttpsAPI(apiUrl, reqBody);

		return callHttpAPI(apiUrl, reqBody);
	}

	/**
	 * 提供FastJson方式的解析json串
	 * 
	 * @author longjiazuo
	 * @param result
	 * @return
	 */
	public static JSONObject parseObject(String result) {
		JSONObject obj = null;
		try {
			obj = FastJSONUtil.parseObject(result);
		} catch (Exception e) {
		}
		return obj;
	}

	/**
	 * 调用API以及创建响应数据格式
	 * 
	 * @author longjiazuo
	 * @param request
	 * @param response
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private JSONObject getResponse(BasicRequest request,
			BasicResponse response, String interfaceName, boolean https)
			throws UnsupportedEncodingException {
		String jsonObj = JSONObject.toJSONString(request);
		String zolInfo = buildDESInfo(URLEncoder.encode(jsonObj,
				ClientConstants.URL_ENCODING));
		Map<String, Object> reqBody = new HashMap<String, Object>();
		// 设置请求体的数据
		reqBody.put(ClientConstants.ApiParam.ZOL_INFO, zolInfo);
		String apiUrl = getRequestMethodServerHost(https) + interfaceName;
		// API方法调用
		HttpResult result = callAPI(apiUrl, reqBody, https);
		if (result.code != HttpURLConnection.HTTP_OK) {
			throw new ClientException("操作失败, http-code:" + result.code
					+ " http-content:" + result.content);
		}
		JSONObject obj = JSONObject.parseObject(result.content);
		Integer status = obj.getInteger(ClientConstants.ApiParam.STATUS);
		Integer code = obj.getInteger(ClientConstants.ApiParam.CODE);
		String message = obj.getString(ClientConstants.ApiParam.MESSAGE);
		JSONObject content = obj
				.getJSONObject(ClientConstants.ApiParam.CONTENT);
		response.setStatus(status);
		response.setCode(code);
		response.setMessage(message);
		return content;
	}

	/* 公用方法 */
	/**
	 * 构建方法实体参数加密数据
	 * 
	 * @author longjiazuo
	 * @param token
	 * @return
	 */
	public String buildDESInfo(String token) {
		DESedeUtils encoder = new DESedeUtils();
		if (!encoder.init(DESedeUtils.ENCRYPT_MODE, appSecret)) {
			throw new RuntimeException("Invalid secretKey");
		}
		ClientRequest hfbReq = new ClientRequest();
		hfbReq.setToken(token);
		return encoder.encrypt(JSONObject.toJSONString(hfbReq));
	}

	/**
	 * 提供解密响应结果数据方法
	 * 
	 * @author longjiazuo
	 * @param ZolInfo
	 * @return
	 */
	public String decryptResult(String ZolInfo) {
		DESedeUtils decoder = new DESedeUtils();
		String zol = null;
		if (!decoder.init(DESedeUtils.DECRYPT_MODE, appSecret)) {
			throw new RuntimeException("Invalid secretKey");
		}
		zol = decoder.decrypt(ZolInfo);
		if (zol == null) {
			throw new RuntimeException("Decrypt user failed");
		}

		return zol;
	}

	/**
	 * http请求
	 * 
	 * @author longjiazuo
	 * @param url
	 * @param body
	 * @return
	 */
	private HttpResult callHttpAPI(String url, Map<String, Object> body) {
		body.put(ClientConstants.ApiParam.VERSION, ClientConstants.API_VERSION);
		body.put(ClientConstants.ApiParam.TIMESTAMP, System.currentTimeMillis());
		String content = JSONObject.toJSONString(body);
		Map<String, String> properties = new HashMap<String, String>();
		String signature;
		try {
			signature = Signer.sign(content, appSecret);
		} catch (Exception e) {
			throw new RuntimeException("Signature failed", e);
		}
		properties.put(ClientConstants.ApiParam.ACCESS_KEY, appKey);
		properties.put(ClientConstants.ApiParam.SIGNATURE, signature);
		HttpResult resp;
		try {
			resp = HttpClient.httpPostJson(url, properties, content, 30000);
		} catch (IOException e) {
			throw new RuntimeException("Send request failed: " + url, e);
		}
		return resp;
	}

	/**
	 * https请求
	 * 
	 * @author longjiazuo
	 * @param url
	 * @param body
	 * @return
	 */
	private HttpResult callHttpsAPI(String url, Map<String, Object> body) {
		// 添加version和timestamp参数
		body.put(ClientConstants.ApiParam.VERSION, ClientConstants.API_VERSION);
		body.put(ClientConstants.ApiParam.TIMESTAMP, System.currentTimeMillis());
		String content = JSONObject.toJSONString(body);
		Map<String, String> properties = new HashMap<String, String>();
		String signature;
		try {
			signature = Signer.sign(content, appSecret);
		} catch (Exception e) {
			throw new RuntimeException("Signature failed", e);
		}
		properties.put(ClientConstants.ApiParam.ACCESS_KEY, appKey);
		properties.put(ClientConstants.ApiParam.SIGNATURE, signature);
		HttpResult resp;
		resp = HttpsClient.httpsPostJson(url, properties, content, 30000);
		return resp;
	}
}
