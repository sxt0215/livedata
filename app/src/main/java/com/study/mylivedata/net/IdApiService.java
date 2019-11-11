package com.study.mylivedata.net;

import android.database.Observable;

import androidx.lifecycle.LiveData;

import com.study.mylivedata.RequestBean.EmptyRequestBean;
import com.study.mylivedata.bean.BannerResponseBean;
import com.study.mylivedata.bean.BaseResponseBean;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;


public interface IdApiService {




    // 获取bannner
    @POST(GLURLConst.KGetConfigBannerApi)
    LiveData bannerList(@Body EmptyRequestBean bean, @HeaderMap Map<String, String> map);

    // 获取banner
    @POST(GLURLConst.KGetConfigBannerApi1)
    Observable<BaseResponseBean<List<BannerResponseBean>>> getBanner(@HeaderMap Map<String, String> map);


}
