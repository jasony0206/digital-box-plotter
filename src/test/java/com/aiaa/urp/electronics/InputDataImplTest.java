package com.aiaa.urp.electronics;

import org.junit.Assert;
import org.junit.Test;

public class InputDataImplTest {

    private InputDataImpl inputDataImpl;

    @Test
    public void canInitializeWithConstructor() {
        // GIVEN
        int deviceId = 1;
        short internalTimestamp = 2;
        char data = 'a';

        // WHEN
        inputDataImpl = new InputDataImpl(deviceId, internalTimestamp, data);

        // THEN
        Assert.assertEquals(deviceId, inputDataImpl.getDeviceId());
        Assert.assertEquals(internalTimestamp, inputDataImpl.getInternalTimestamp());
        Assert.assertEquals(data, inputDataImpl.getData());
    }
}
