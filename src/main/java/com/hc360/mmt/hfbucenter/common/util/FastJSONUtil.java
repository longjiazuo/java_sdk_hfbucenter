package com.hc360.mmt.hfbucenter.common.util;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 封装fastJson工具类
 *
 * @description:
 *
 * @author longjiazuo
 * @createtime 2016年4月14日下午8:38:11
 * @version 4.0
 * @since 4.0
 */
public class FastJSONUtil {

	/**
	 * 把JSON文本parse为JSONObject或者JSONArray
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:30:40
	 */
	public static Object parse(String text) {
		return JSON.parse(text);
	}

	/**
	 * 把JSON文本parse成JSONObject
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:30:22
	 */
	public static JSONObject parseObject(String text) {
		return JSONObject.parseObject(text);
	}

	/**
	 * 把JSON文本parse为JavaBean
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:30:30
	 */
	public static <T> T parseObject(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

	/**
	 * 把JSON文本parse成JSONArray
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:31:48
	 */
	public static JSONArray parseArray(String text) {
		return JSON.parseArray(text);
	}

	/**
	 * 把JSON文本parse成JavaBean集合
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:34:03
	 */
	public static <T> List<T> parseArray(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz);
	}

	/**
	 * 将JavaBean序列化为JSON文本
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:35:51
	 */
	public static String toJSONString(Object object) {
		return JSON.toJSONString(object);
	}

	/**
	 * 将JavaBean序列化为JSON文本
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:35:51
	 */
	public static String toJSONString(Object object, String serializerFeature) {
		return JSON.toJSONString(object, SerializerFeature.WriteMapNullValue);
	}

	/**
	 * 将JavaBean序列化为带格式的JSON文本
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:36:41
	 */
	public static String toJSONString(Object object, boolean prettyFormat) {
		return JSON.toJSONString(object, prettyFormat);
	}

	/**
	 * 将JavaBean转换为JSONObject或者JSONArray
	 * 
	 * @Description TODO
	 * @author longjiazuo
	 * @createtime 2016年4月14日下午8:37:39
	 */
	public static Object toJSON(Object javaObject) {
		return JSON.toJSON(javaObject);
	}
}
