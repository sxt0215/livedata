package com.study.mylivedata.net;

import androidx.lifecycle.LiveData;

import org.jetbrains.annotations.Nullable;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import retrofit2.CallAdapter;
import retrofit2.Retrofit;

public class LiveDataCallAdapterFactory extends CallAdapter.Factory {

    @Nullable
    public CallAdapter<?, ?> get( @Nullable Type returnType, Annotation[] annotations, Retrofit retrofit) {
        if(getRawType(returnType) != LiveData.class){
            return null;
        }else {
            //获取第一个逻辑类型
            // val observableType = getParameterUpperBound(0, returnType as ParameterizedType)
            Type observableType = getParameterUpperBound(0,(ParameterizedType)returnType);
            Type rawType = getRawType(observableType);
            if (rawType != MyResponseBodyConverter.class) {
                throw new IllegalArgumentException("type must be ApiResponse");
            }
            if (!(observableType instanceof ParameterizedType)) {
                throw new IllegalArgumentException("resource must be parameterized");
            }
            return new LiveDataCallAdapter(observableType);
        }
    }
}
