import org.junit.Assert;
import org.junit.Test;

public class InputDataTest {

    private InputData inputData;

    @Test
    public void canInitializeWithConstructor() {
        // GIVEN
        int deviceId = 1;
        short internalTimestamp = 2;
        char data = 'a';

        // WHEN
        inputData = new InputData(deviceId, internalTimestamp, data);

        // THEN
        Assert.assertEquals(deviceId, inputData.getDeviceId());
        Assert.assertEquals(internalTimestamp, inputData.getInternalTimestamp());
        Assert.assertEquals(data, inputData.getData());
    }
}
