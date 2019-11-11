package com.study.mylivedata;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.study.mylivedata.base.BaseViewModel;
import com.study.mylivedata.bean.BannerResponseBean;
import com.study.mylivedata.bean.BaseResponseBean;
import com.study.mylivedata.net.RetrofitAndLiveDataManager;

import java.util.ArrayList;
import java.util.List;

import kotlin.jvm.internal.Intrinsics;

public class MainVM extends BaseViewModel {
    private LiveData bannerList;
    private LiveData banners;

    public MainVM(){

    }







}
