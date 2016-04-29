package com.hc360.mmt.hfbucenter.common.util.https;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.hc360.mmt.hfbucenter.common.util.http.HttpClient.HttpResult;

/* 
 * 利用HttpClient进行post请求的工具类 
 */
public class HttpsClient {
	@SuppressWarnings("resource")
	public String doPost(String url, Map<String, String> map, String charset) {
		HttpClient httpClient = null;
		HttpPost httpPost = null;
		String result = null;
		try {
			httpClient = new SSLClient();
			httpPost = new HttpPost(url);
			// 设置参数
			List<NameValuePair> list = new ArrayList<NameValuePair>();
			Iterator<?> iterator = map.entrySet().iterator();
			while (iterator.hasNext()) {
				@SuppressWarnings("unchecked")
				Entry<String, String> elem = (Entry<String, String>) iterator
						.next();
				list.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
			}
			if (list.size() > 0) {
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list,
						charset);
				httpPost.setEntity(entity);
			}
			HttpResponse response = httpClient.execute(httpPost);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					result = EntityUtils.toString(resEntity, charset);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	@SuppressWarnings("resource")
	public static HttpResult httpsPostJson(String url,
			Map<String, String> properties, String content, long readTimeoutMs) {

		HttpClient httpClient = null;
		HttpPost httpPost = null;
		String result = null;
		int respCode = 400;
		try {
			httpClient = new SSLClient();
			httpPost = new HttpPost(url);
			httpPost.setHeader("Content-Type", "application/json");
			httpPost.setHeader("Accept", "application/json");
			if (properties != null) {
				for (Map.Entry<String, String> entry : properties.entrySet()) {
					httpPost.setHeader(entry.getKey(), entry.getValue());
				}
			}
			// content 为参数
			StringEntity entity = new StringEntity(content);
			httpPost.setEntity(entity);

			HttpResponse response = httpClient.execute(httpPost);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				respCode = response.getStatusLine().getStatusCode();
				if (resEntity != null) {
					result = EntityUtils.toString(resEntity);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return new HttpResult(respCode, result);
	}
}
