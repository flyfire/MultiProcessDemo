package com.solarexsoft.multiprocessdemo;

import android.os.Process;
import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <pre>
 *    Author: houruhou
 *    CreatAt: 18:47/2020/3/10
 *    Desc:
 * </pre>
 */

public class Utils {
    private static final String TAG = "Utils";
    public void test(String from) {
        Log.d(TAG, from + ",utils = " + this + ",classloader = " + getClass().getClassLoader() + ",pid = " + Process.myPid());
        try {
            Class<?> activityThreadClz = Class.forName("android.app.ActivityThread");
            Method currentActivityThread = activityThreadClz.getDeclaredMethod("currentActivityThread");
            currentActivityThread.setAccessible(true);
            Object invoke = currentActivityThread.invoke(null);
            Log.d(TAG, "activity thread = " + invoke);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
