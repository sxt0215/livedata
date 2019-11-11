package com.study.mylivedata.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.study.mylivedata.net.RetrofitAndLiveDataManager;

import org.jetbrains.annotations.NotNull;

public class BaseViewModel extends ViewModel {

    public MutableLiveData loading = new MutableLiveData();

    private  RetrofitAndLiveDataManager api;

    public BaseViewModel(){
        this.api = (RetrofitAndLiveDataManager) api.getApiService();
    }

    public  MutableLiveData getLoading() {
        return this.loading;
    }

    protected  RetrofitAndLiveDataManager getApi() {
        return this.api;
    }

    public void loadData() {
        this.loading.setValue(true);
    }


}
