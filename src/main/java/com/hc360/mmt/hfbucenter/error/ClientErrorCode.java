package com.hc360.mmt.hfbucenter.error;

/**
 * �ͻ��˴������
 * 
 * @author longjiazuo
 * @version 4.0
 * @since 4.0
 * @createtime 2016��4��22������2:13:36
 */
public interface ClientErrorCode {
	public final static String PARAM_ARE_NULL = "parameters cannot be empty";
	public final static String APPKEY_ARE_NULL = "appKey cannot be empty";
	public final static String APPSECRET_ARE_NULL = "appSecret cannot be empty";
	public final static String CLIENT_GET_INTERFACE_ERROR = "client get interface name error";
	public final static String CANNOT_GET_MATCH_INTERFACE = "can not get match interface name";
}
