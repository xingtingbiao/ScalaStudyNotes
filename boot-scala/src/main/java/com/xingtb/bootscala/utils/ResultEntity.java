package com.xingtb.bootscala.utils;

import java.io.Serializable;

public class ResultEntity<T> implements Serializable {
    /** 状态码 */
    private Integer code;

    /** 信息提示 */
    private String message;

    /** 具体的内容 */
    private T data;

    public ResultEntity() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
