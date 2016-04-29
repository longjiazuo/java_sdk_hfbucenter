package com.hc360.mmt.hfbucenter.exception;

/**
 * 自定义异常类
 * 
 * @author longjiazuo
 * @createtime 2016年4月22日上午11:27:42
 * @version 4.0
 * @since 4.0
 */
public class ClientException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ClientException(String message) {
		super(message);
	}

	public ClientException(Throwable cause) {
		super(cause);
	}
}
