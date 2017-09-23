package com.margin.model.net;


import com.margin.model.bean.Categorys;
import com.margin.model.bean.Home;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dongjijin on 2017/8/10 0010.
 */

public interface NetService {
    @GET("getCategorys.jsp")
    Observable<Categorys> getCategorys();

    @GET("home.jsp")
    Observable<Home> getHome(@Query("lastLikeIds") String lastLikeIds);

}
