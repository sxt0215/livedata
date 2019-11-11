package com.study.mylivedata.net;

import androidx.lifecycle.LiveData;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.Response;

public final class LiveDataCallAdapter implements CallAdapter {
    private final Type responseType;
    @NotNull
    public LiveData adapt(@NotNull final Call call){
        Intrinsics.checkParameterIsNotNull(call, "call");
        return (new LiveData() {
            private final AtomicBoolean started = new AtomicBoolean(false);

            @Override
            protected void onActive() {
                super.onActive();
                if (this.started.compareAndSet(false, true)) {
                    call.enqueue(new Callback() {
                        @Override
                        public void onResponse(Call call, Response response) {
                            Intrinsics.checkParameterIsNotNull(call, "call");
                            Intrinsics.checkParameterIsNotNull(response, "response");
                            postValue(response.body());
                        }

                        @Override
                        public void onFailure(Call call, Throwable t) {
                            Intrinsics.checkParameterIsNotNull(call, "call");
                            Intrinsics.checkParameterIsNotNull(t, "t");
                            MyResponseBodyConverter myResponseBodyConverter = new MyResponseBodyConverter();
                            String message = t.getMessage();
                            if (message == null) {
                                message = "";
                            }
//                            myResponseBodyConverter.<init>((Object)null, -1, message);
                            Object value = myResponseBodyConverter;
                            postValue(value);
                        }
                    });
                }
            }
        });
    }

    public LiveDataCallAdapter(@NotNull Type responseType) {
        super();
        Intrinsics.checkParameterIsNotNull(responseType, "responseType");
        this.responseType = responseType;
    }


    @NotNull
    public Type responseType() {
        return this.responseType;
    }

}
