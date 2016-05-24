package com.hc360.mmt.hfbucenter.common.constants;

/**
 * API常量
 * 
 * @author longjiazuo
 * @createtime 2016年4月22日上午10:13:07
 * @version 4.0
 * @since 4.0
 */
public class ClientConstants {
	public static final String URL_ENCODING = "UTF-8";
	public static final String BACK_URL = "back_url";
	public static final String APP_KEY = "app_key";

	public static final String API_VERSION_1_0 = "1.0";
	public static final String API_VERSION = API_VERSION_1_0;

	public static final String HTTPS_SCHEME = "https";
	public static final String HTTP_SCHEME = "http";
	public static final String SEPARATOR = ",";

	// 访问接口常量
	public static class InterfaceParam {
		public static final String SERVER_HOST = "hcpay.hc360.com/hfbucenter/api/";
		public static final String BIND_BANKCARD = "bind_bankCard";
		public static final String QUERY_HFBBALANCE = "query_hfbBalance";
		public static final String SEND_SMS = "send_SMS";
		public static final String WITHDRAW_CASH = "withdraw_cash";
		public static final String GET_BACHWITHDRAWCASHRESULT = "get_bachWithdrawCashResult";
		public static final String GETINCOMEFLOW = "getInComeFlow";
		public static final String GETOUTCOMEFLOW = "getOutComeFlow";
		public static final String BIND_BANKCARDANDWITHDRAW_CASH = "bindCardAndWithdrawCash";
	}

	// 配置参数常量
	public static class ConfigParam {
		public static final String SERVER_HOST = "SERVER_HOST";
		public static final String LOGIN_BACK = "LOGIN_BACK_URL";
		public static final String EXCLUSIONS = "EXCLUSIONS";
		public static final String APP_KEY = "APP_KEY";
		public static final String APP_SECRET = "APP_SECRET";
	}

	// api参数常量
	public static class ApiParam {
		public static final String ACCESS_KEY = "X-Access-Key";
		public static final String SIGNATURE = "X-Signature";
		public static final String VERSION = "version";
		public static final String TIMESTAMP = "timestamp";
		public static final String ZOL_INFO = "zolInfo";
		public static final String STATUS = "status";
		public static final String CODE = "code";
		public static final String MESSAGE = "message";
		public static final String CONTENT = "content";
		public static final String HFBCODE = "hfbCode";
		public static final String SMSCODE = "SMSCode";
		public static final String SMSCODEKEYID = "sMSCodeKeyId";
		public static final String ZOLBUSINESSID = "zolBusinessId";
		public static final String CASHBACHID = "cashBachId";
		public static final String RESULT = "result";
		public static final String CARD = "card";
		public static final String CLIENTTOKEN = "clientToken";
	}
}
