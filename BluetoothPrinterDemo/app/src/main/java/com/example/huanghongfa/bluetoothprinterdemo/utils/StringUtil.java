package com.example.huanghongfa.bluetoothprinterdemo.utils;

/**
 * Created by huanghongfa on 2017/3/1.
 *
 * 工具类
 */

public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.trim().equals("");
    }

    public static int length(CharSequence str) {
        return str == null ? 0 : str.length();
    }
}
