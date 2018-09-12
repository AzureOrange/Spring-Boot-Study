package com.study.common;

/**
 * 功能描述：自定义异常类
 *
 * @author orange
 */
public class MyException extends RuntimeException {

	private long code;
	private String msg;

    public MyException(long code, String msg) {
        this.code = code;
        this.msg = msg;
    }


	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}