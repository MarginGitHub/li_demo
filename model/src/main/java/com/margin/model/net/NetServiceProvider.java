package com.margin.model.net;

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

    public static NetServiceProvider instance(Context context) {
        if (sInstance == null) {
            synchronized (NetServiceProvider.class) {
                if (sInstance == null) {
                    sInstance = new NetServiceProvider(context);
                }
            }
        }
        return sInstance;
    }

    private NetServiceProvider(Context context) {
        mContext = context;
    }

//    初始化
    public synchronized  T provider(Class<T> clazz, String baseUrl) {
        OkHttpConfig.createCache(mContext.getCacheDir());
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(OkHttpConfig.client(mContext))
                .build();
        return retrofit.create(clazz);
    }

}
