package com.xiaoyaolvxing.WskSp;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends io.dcloud.PandoraEntry {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.KITKAT) {
            //if (0 != (getApplicationInfo().flags &= ApplicationInfo.FLAG_DEBUGGABLE))
            //{ WebView.setWebContentsDebuggingEnabled(true);}
        //}
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

    }
}
