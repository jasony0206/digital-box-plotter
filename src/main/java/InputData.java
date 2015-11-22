public class InputData {

    // This class models the input data we receive from the master.

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
