package com.example.huanghongfa.bluetoothprinterdemo.manager;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

import com.example.huanghongfa.bluetoothprinterdemo.entity.BluetoothEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huanghongfa on 2017/3/1.
 * 主要做蓝牙相关操作，
 */

public class BluetoothManagers {

    private final static String TAG = "MainActivity";

    private static volatile Object lock = new Object();
    private static BluetoothManagers instance = null;
    private Context mContext;
    private List<BluetoothEntity> list = new ArrayList<>();
    private BluetoothAdapter mBluetoothAdapter = null;//蓝牙设配器

    public static BluetoothManagers getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new BluetoothManagers();
                }
            }
        }
        return instance;
    }
}
