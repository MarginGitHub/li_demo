package com.margin.model.net;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by margin on 17-9-23.
 */

public class NetInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request = request.newBuilder()
                .addHeader("X-Channel-Code", "official")
                .addHeader("X-Client-Agent", "")
                .addHeader("X-Client-Hash", "")
                .addHeader("X-Client-ID", "")
                .addHeader("X-Client-Version", "")
                .addHeader("X-Long-Token", "")
                .addHeader("X-Platform-Type", "")
                .addHeader("X-Platform-Version", "")
                .addHeader("X-Serial-Num", String.valueOf(System.currentTimeMillis() / 1000L))
                .addHeader("X-User-ID", "")
                .build();
        Response response = chain.proceed(request);
        return response;
    }
}
