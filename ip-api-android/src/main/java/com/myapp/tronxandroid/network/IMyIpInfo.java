package com.myapp.tronxandroid.network;

/**
 * Created by smartron on 2/1/18.
 */

public interface IMyIpInfo {
    void myIpInfoSuccess(MyIpInfoModel myIpInfoModel);

    void myIpInfoFailure(String message);
}
