package com.margin.livideo;

import android.app.Application;

import com.margin.model.net.NetService;
import com.margin.model.net.NetServiceConfig;
import com.margin.model.net.NetServiceProvider;

/**
 * Created by dongjijin on 2017/9/28 0028.
 */

public class LiVideoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NetServiceProvider.init(getApplicationContext(), NetService.class, NetServiceConfig.BASE_URL);
    }
}
