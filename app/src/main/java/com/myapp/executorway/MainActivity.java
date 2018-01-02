package com.myapp.executorway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.myapp.tronxandroid.network.IMyIpInfo;
import com.myapp.tronxandroid.network.MyIpInfoModel;
import com.myapp.tronxandroid.network.IpApiExecutor;


public class MainActivity extends AppCompatActivity implements IMyIpInfo {
    private TextView city_tv;
    private IpApiExecutor mIpApiExecutor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city_tv = findViewById(R.id.city_tv);
        mIpApiExecutor = new IpApiExecutor(this);
        mIpApiExecutor.getMyIpInfo();
    }

    @Override
    public void myIpInfoSuccess(MyIpInfoModel myIpInfoModel) {
        city_tv.setText(myIpInfoModel.getCity());
    }

    @Override
    public void myIpInfoFailure(String message) {
        city_tv.setText(message);
    }
}
