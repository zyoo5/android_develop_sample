package com.pinger.mvp.utils;

import android.util.Log;

/**
 * @author Pinger
 * @since 2017/3/21 0021 下午 1:10
 * 日志打印
 */
public class RetrofitLog {

    private static boolean isLogEnable = true;
    public static String tag = "Retrofit";

    public RetrofitLog() {
    }

    public static void debug(boolean isEnable) {
        debug(tag, isEnable);
    }

    public static void debug(String logTag, boolean isEnable) {
        tag = logTag;
        isLogEnable = isEnable;
    }

    public static void v(String msg) {
        v(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (isLogEnable) {
            Log.v(tag, msg);
        }

    }

    public static void d(String msg) {
        d(tag, msg);
    }

    public static void d(String tag, String msg) {
        if (isLogEnable) {
            Log.d(tag, msg);
        }

    }

    public static void i(String msg) {
        i(tag, msg);
    }

    public static void i(String tag, String msg) {
        if (isLogEnable) {
            Log.i(tag, msg);
        }

    }

    public static void w(String msg) {
        w(tag, msg);
    }

    public static void w(String tag, String msg) {
        if (isLogEnable) {
            Log.w(tag, msg);
        }

    }

    public static void e(String msg) {
        e(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (isLogEnable) {
            Log.e(tag, msg);
        }

    }

    public static void e(Throwable t) {
        if (isLogEnable) {
            t.printStackTrace();
        }

    }

}
