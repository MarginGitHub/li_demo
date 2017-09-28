package com.margin.model.net;

import android.app.Application;
import android.content.Context;
import android.support.annotation.Nullable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import io.reactivex.schedulers.Schedulers;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dongjijin on 2017/8/7 0007.
 */

public class NetServiceProvider<T> {
    private static NetServiceProvider sInstance;
    private Context mContext;
    private T mService;

    private NetServiceProvider(Context context) {
        mContext = context;
    }

    public static <T> void init(Context context, Class<T> clazz, String baseUrl) {
        sInstance = new NetServiceProvider(context);
        sInstance.mService = sInstance.service(clazz, baseUrl);
    }

//    初始化
    public synchronized  T service(Class<T> clazz, String baseUrl) {
        OkHttpConfig.createCache(mContext.getCacheDir());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(OkHttpConfig.client(mContext))
                .build();
        return retrofit.create(clazz);
    }
    public static NetServiceProvider getInstance() {
        return sInstance;
    }


    public T getService() {
        return mService;
    }

}
