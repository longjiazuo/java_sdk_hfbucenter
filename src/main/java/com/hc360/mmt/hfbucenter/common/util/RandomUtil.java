package com.hc360.mmt.hfbucenter.common.util;

import java.util.Random;
import java.util.UUID;

/**
 * @description:��������ɹ�����
 *
 * @author longjiazuo
 * @createtime 2016��4��13������12:34:31
 * @version 4.0
 * @since 4.0
 */
public class RandomUtil {
	/**
	 * ����32λuuid
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * 
	 * @Description ����4λ���������
	 * @author longjiazuo
	 * @createtime 2016��4��13������12:33:07
	 */
	public static String getRandomVerifyCode() {
		return getRandomVerifyCode(4);
	}

	/**
	 * 
	 * @Description ����countλ���������
	 * @author longjiazuo
	 * @createtime 2016��4��13������12:33:07
	 */
	public static String getRandomVerifyCode(int count) {
		StringBuffer sb = new StringBuffer();
		String str = "0123456789";
		Random r = new Random();
		for (int i = 0; i < count; i++) {
			int num = r.nextInt(str.length());
			sb.append(str.charAt(num));
			str = str.replace((str.charAt(num) + ""), "");
		}
		return sb.toString();
	}
}
