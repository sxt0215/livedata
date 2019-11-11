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
        this.bannerList = Transformations.switchMap(this.getPage(), new Function() {
            @Override
            public Object apply(Object input) {
                return this.apply(input);
            }

            public final LiveData apply(Integer it) {
                LiveData liveData;
                if (it != null) {
                    if (it == 0) {
                        liveData = MainVM.this.getApi().bannerList();
                        return liveData;
                    }
                }
                liveData = AbsentLiveData.Companion.create();
                return liveData;
            }
        }));
        LiveData liveData = Transformations.map(this.bannerList, (Function)(new Function() {
            // $FF: synthetic method
            // $FF: bridge method
            public Object apply(Object var1) {
                return this.apply((BaseResponseBean)var1);
            }

            public final List apply(BaseResponseBean it) {
                MainVM.this.getLoading().setValue(false);
                List list = (List)it.getData();
                if (list == null) {
                    list = (List)(new ArrayList());
                }

                return list;
            }
        }));
        Intrinsics.checkExpressionValueIsNotNull(liveData, "Transformations.map(bann…data ?: ArrayList()\n    }");
        this.banners = liveData;
    }







}
