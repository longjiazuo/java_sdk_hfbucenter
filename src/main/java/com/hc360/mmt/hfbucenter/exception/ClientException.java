package com.hc360.mmt.hfbucenter.exception;

/**
 * �Զ����쳣��
 * 
 * @author longjiazuo
 * @createtime 2016��4��22������11:27:42
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
