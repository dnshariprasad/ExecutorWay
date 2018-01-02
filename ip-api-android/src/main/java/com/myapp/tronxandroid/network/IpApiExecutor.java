package com.myapp.tronxandroid.network;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by smartron on 2/1/18.
 */

public class IpApiExecutor {
    private IMyIpInfo iMyIpInfo;

    public IpApiExecutor(IMyIpInfo iMyIpInfo) {
        this.iMyIpInfo = iMyIpInfo;
    }

    public void getMyIpInfo() {
        NetworkHandler.instance().customerApi().myIpInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new Observer<MyIpInfoModel>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(MyIpInfoModel s) {
                iMyIpInfo.myIpInfoSuccess(s);
            }

            @Override
            public void onError(Throwable e) {
                iMyIpInfo.myIpInfoFailure(e.getLocalizedMessage());
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
