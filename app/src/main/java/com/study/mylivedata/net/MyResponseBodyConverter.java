package com.study.mylivedata.net;

import android.text.TextUtils;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Converter;

public class MyResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    public static final int OK = 200;
    private static final String code = "code";
    private static final String msg = "message";
    private static final String response = "response";

    private Gson gson;
    private Type type;
    public MyResponseBodyConverter() {
        this.gson = gson;
        this.type = type;
    }

    public MyResponseBodyConverter(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String string = value.string();
        value.close();
        //无加密使用
//        Log.e("show","----------------------------------------------------------------");
//        Log.e("show",type.getClass().getCanonicalName());
//        return gson.fromJson(string,type);


        //加密使用  解密
        String result = "";
        try {
            String change = string.substring(1);
            change = change.substring(0, change.length() - 1);
            result = AesUtil.decryptCBC(change, AesUtil.KEY);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(result)) {
            result = string;
        }
        value.close();
        return gson.fromJson(result, type);

    }

}
