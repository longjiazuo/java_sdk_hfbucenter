package com.hc360.mmt.hfbucenter.common.util;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * ��װfastJson������
 *
 * @description:
 *
 * @author longjiazuo
 * @createtime 2016��4��14������8:38:11
 * @version 4.0
 * @since 4.0
 */
public class FastJSONUtil {

	/**
	 * ��JSON�ı�parseΪJSONObject����JSONArray
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:30:40
	 */
	public static Object parse(String text) {
		return JSON.parse(text);
	}

	/**
	 * ��JSON�ı�parse��JSONObject
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:30:22
	 */
	public static JSONObject parseObject(String text) {
		return JSONObject.parseObject(text);
	}

	/**
	 * ��JSON�ı�parseΪJavaBean
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:30:30
	 */
	public static <T> T parseObject(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

	/**
	 * ��JSON�ı�parse��JSONArray
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:31:48
	 */
	public static JSONArray parseArray(String text) {
		return JSON.parseArray(text);
	}

	/**
	 * ��JSON�ı�parse��JavaBean����
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:34:03
	 */
	public static <T> List<T> parseArray(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz);
	}

	/**
	 * ��JavaBean���л�ΪJSON�ı�
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:35:51
	 */
	public static String toJSONString(Object object) {
		return JSON.toJSONString(object);
	}

	/**
	 * ��JavaBean���л�ΪJSON�ı�
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:35:51
	 */
	public static String toJSONString(Object object, String serializerFeature) {
		return JSON.toJSONString(object, SerializerFeature.WriteMapNullValue);
	}

	/**
	 * ��JavaBean���л�Ϊ����ʽ��JSON�ı�
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:36:41
	 */
	public static String toJSONString(Object object, boolean prettyFormat) {
		return JSON.toJSONString(object, prettyFormat);
	}

	/**
	 * ��JavaBeanת��ΪJSONObject����JSONArray
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016��4��14������8:37:39
	 */
	public static Object toJSON(Object javaObject) {
		return JSON.toJSON(javaObject);
	}
}
