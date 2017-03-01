package com.example.huanghongfa.bluetoothprinterdemo.entity;

/**
 * Created by huanghongfa on 2017/3/1.
 * 主要是蓝牙的实体类
 */

public class BluetoothEntity {

    private String deviceName;//设备名称

    private String deviceAddress;//设备地址（Mac地址）

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }


    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
