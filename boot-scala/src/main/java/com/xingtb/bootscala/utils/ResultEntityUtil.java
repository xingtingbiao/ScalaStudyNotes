package com.xingtb.bootscala.utils;

/**
 * Boot 返回值的工具类
 */
public class ResultEntityUtil {

    public static ResultEntity success(Object object) {
        ResultEntity<Object> entity = new ResultEntity<>();
        entity.setCode(0);
        entity.setData(object);
        entity.setMessage("Success");
        return entity;
    }

    public static ResultEntity success() {
        return success(null);
    }

    public static ResultEntity error(Integer code, String msg) {
        ResultEntity<Object> entity = new ResultEntity<>();
        entity.setCode(code);
        entity.setMessage(msg);
        return entity;
    }
}
