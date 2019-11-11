package com.study.mylivedata.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.study.mylivedata.net.RetrofitAndLiveDataManager;

import org.jetbrains.annotations.NotNull;

public class BaseViewModel extends ViewModel {

    public MutableLiveData refreshTrigger = new MutableLiveData();
    public MutableLiveData loading = new MutableLiveData();
    private MutableLiveData page;
    private  RetrofitAndLiveDataManager api;

    public BaseViewModel(){
        this.api = (RetrofitAndLiveDataManager) api.getApiService();
        this.page = new MutableLiveData();
    }


    public  MutableLiveData getRefreshTrigger() {
        return this.refreshTrigger;
    }

    public  MutableLiveData getLoading() {
        return this.loading;
    }

    protected  RetrofitAndLiveDataManager getApi() {
        return this.api;
    }

    protected final MutableLiveData getPage() {
        return this.page;
    }

    public void loadData() {
        this.refreshTrigger.setValue(true);
        this.loading.setValue(true);
    }


}
