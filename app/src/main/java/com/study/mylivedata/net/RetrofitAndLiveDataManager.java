package com.study.mylivedata.net;


import java.io.IOException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;


public class RetrofitAndLiveDataManager {
    private static RetrofitAndLiveDataManager retrofitManager;
    private OkHttpClient okHttpClient;
    private Retrofit retrofit;


    private static IdApiService retrofitApiService;
    private RetrofitAndLiveDataManager() {
        initOkHttpClient();
        initRetrofit();
    }

    public static IdApiService getApiService() {
        if (retrofitManager == null) {
            synchronized (RetrofitAndLiveDataManager.class) {
                if (retrofitManager == null) {
                    retrofitManager = new RetrofitAndLiveDataManager();
                }
            }
        }

        return retrofitApiService;
    }

    private void initRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.google.com")
                .addConverterFactory(MyRetrofitConverterFactory.create())
                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                .client(okHttpClient)
                .build();
        retrofitApiService = retrofit.create(IdApiService.class);
    }


    private void initOkHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.level(HttpLoggingInterceptor.Level.BODY);
        okHttpClient = new OkHttpClient.Builder().addInterceptor(interceptor) //添加log拦截器
                .connectTimeout(60, TimeUnit.SECONDS).
                        readTimeout(60, TimeUnit.SECONDS).
                        writeTimeout(60, TimeUnit.SECONDS).
                        proxy(Proxy.NO_PROXY).
                        addNetworkInterceptor(interceptor).
                        addInterceptor(new Interceptor() {
                            @Override
                            public Response intercept(Chain chain) throws IOException {
                                Request request = chain.request().newBuilder()
                                        .build();
                                return chain.proceed(request);
                            }
                        })
                .build();
    }


}
