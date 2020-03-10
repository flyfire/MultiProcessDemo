package com.solarexsoft.multiprocessdemo;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.util.Log;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 19:00/2020/3/10
 *    Desc:
 * </pre>
 */

public class App extends Application {
    private static final String TAG = "App";
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.d(TAG, "attachBaseContext: base = " + base + ",classloader = " + getClassLoader() + ",pid = " + Process.myPid());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: classloader = " + getClassLoader() + ",pid = " + Process.myPid());
    }
}
