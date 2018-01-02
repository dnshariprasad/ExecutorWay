package com.myapp.tronxandroid.network;


import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by smartron on 2/1/18.
 */

public interface IpApi {
    String REST_URL = "https://ipapi.co";

    @GET("/json")
    Observable<MyIpInfoModel> myIpInfo();
}
