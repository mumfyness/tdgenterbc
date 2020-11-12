package com.tdgenterprise.blockchain;

public class Data {
    private String deviceName;
    private int deviceID;
    private double deviceData;
    private long dateTimeCreated;

    public Data(String deviceName, int deviceID, double deviceData) {
        this.deviceName = deviceName;
        this.deviceID = deviceID;
        this.deviceData = deviceData;
        dateTimeCreated = System.currentTimeMillis();

    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public double getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(double deviceData) {
        this.deviceData = deviceData;
    }

    public long getDateTimeCreated() {
        return dateTimeCreated;
    }
}
