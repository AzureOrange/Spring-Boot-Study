package com.study.common;

import lombok.ToString;

/**
 * 异常信息code
 *
 * @author orange
 * @Time 2018/9/12 0012
 */
@ToString(callSuper = true, includeFieldNames = false)
public enum ApiStatus {
    ModelA_Exception(1900, "模块A相关异常"),
    ModelB_Exception(1900, "模块B相关异常");
    /**
     * Exception code
     */
    private long code;
    /**
     * A short description of exception.
     */
    private String message;

    ApiStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Exception code.
     *
     * @return meaningful number
     */
    public long code() {
        return this.code;
    }

    /**
     * A short description of exception.
     *
     * @return A short description of exception.
     */
    public String message() {
        return this.message;
    }
}
