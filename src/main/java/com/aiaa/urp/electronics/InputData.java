package com.aiaa.urp.electronics;

public class InputData {

    // This class models the input data we receive from the master device.
    // It is only a model, and its design may change to better represent
    // the actual data format returned by the device.

    private int deviceId;
    private short internalTimestamp;
    private char data;

    public InputData(int deviceId, short internalTimestamp, char data) {
        this.deviceId = deviceId;
        this.internalTimestamp = internalTimestamp;
        this.data = data;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public short getInternalTimestamp() {
        return internalTimestamp;
    }

    public char getData() {
        return data;
    }
}
