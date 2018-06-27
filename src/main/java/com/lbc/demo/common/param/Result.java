package com.lbc.demo.common.param;

/**
 * @description:
 * @author: wufenyun
 * @date: 2018-06-27 13
 **/
public class Result<T> extends BaseResult {

    private T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}