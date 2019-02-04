package pl.coderstrust.ipaddress;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class IpAddressValidatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Ignore
    public void shouldReturnTrueForAllCombinationsOfIpAddress() {
        String ipAddress;
        for (int i = 0; i <= 255; i++) {
            for (int j = 0; j <= 255; j++) {
                for (int k = 0; k <= 255; k++) {
                    for (int l = 0; l <= 255; l++) {
                        ipAddress = String.format("%d.%d.%d.%d", i, j, k, l);
                        assertTrue(IpAddressValidator.isIpAddress(ipAddress));
                    }
                }
            }
        }
    }

    @Test
    @Parameters({"192.0.2.255", "0.192.2.255", "255.255.255.255", "0.0.0.0"})
    public void shouldReturnTrueForCorrectIpAddress(String ipAddress) {
        assertTrue(IpAddressValidator.isIpAddress(ipAddress));
    }

    @Test
    @Parameters({"1920.0.2.255", "00.192.2.255", "255.two.255.255", "-1.0.0.0"})
    public void shouldReturnFalseForIncorrectIpAddress(String ipAddress) {
        assertFalse(IpAddressValidator.isIpAddress(ipAddress));
    }

    @Test
    public void shouldThrowExceptionForNullAsIpAddress() {
        String ipAddress = null;
        thrown.expectMessage("IP Address cannot be a null");
        thrown.expect(IllegalArgumentException.class);
        IpAddressValidator.isIpAddress(ipAddress);
    }

    @Test
    @Parameters({"%d.1.1.1", "1.%d.1.1", "1.1.%d.1", "1.1.1.%d"})
    public void smartTestForValidIpAddresses(String ipAddressTemplate) {
        String ipAddress;
        for (int i = 0; i <= 255; i++) {
            ipAddress = String.format(ipAddressTemplate, i);
            assertTrue(IpAddressValidator.isIpAddress(ipAddress));
        }
    }
}
