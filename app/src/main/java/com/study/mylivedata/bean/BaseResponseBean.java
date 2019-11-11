package com.study.mylivedata.bean;

import com.google.gson.annotations.SerializedName;

public class BaseResponseBean<T> {

    // 全局code
    private int code;

    // 提示信息
    private  String msg;

    // 返回的数据
    private  T data;

    // 请求id
    @SerializedName("__requestId")
    private  String requestId;

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public String getRequestId() {
        return requestId;
    }

    @Override
    public String toString() {
        return "BaseResponseBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
