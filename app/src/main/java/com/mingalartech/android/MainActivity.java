package com.mingalartech.android;

import androidx.appcompat.app.AppCompatActivity;
import com.mingalartech.android.library.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        AlertMGLT alert=new AlertMGLT(this);
//        SysInfo hash=new SysInfo(this);this
        final Ads myAds=new Ads(this);
        myAds.loadAd(new adListener() {

            @Override
            public void onSuccess(Object object) {
                myAds.showIntAd();
            }

            @Override
            public void onFailed(Object String) {

            }
        });


    }
}
