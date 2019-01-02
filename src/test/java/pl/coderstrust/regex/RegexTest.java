package pl.coderstrust.regex;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class RegexTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Ignore
    public void ChecksAllPossibleCorrectCombinations() {
        String ipAddress;
        for (int i = 0; i <= 255; i++) {
            for (int j = 0; j <= 255; j++) {
                for (int k = 0; k <= 255; k++) {
                    for (int l = 0; l <= 255; l++) {
                        ipAddress = String.format("%d.%d.%d.%d", i, j, k, l);
                        assertTrue(Regex.isIpAddress(ipAddress));
                    }
                }
            }
        }
    }

    @Test
    @Parameters({"192.0.2.255", "0.192.2.255", "255.255.255.255", "0.0.0.0"})
    public void shouldReturnTrueForCorrectIpAddress(String ipAddress) {
        assertTrue(Regex.isIpAddress(ipAddress));
    }

    @Test
    @Parameters({"1920.0.2.255", "00.192.2.255", "255.two.255.255", "-1.0.0.0"})
    public void shouldReturnFalseForIncorrectIpAddress(String ipAddress) {
        assertFalse(Regex.isIpAddress(ipAddress));
    }

    @Test
    public void shouldThrowExceptionForNull() {
        String ipAddress = null;
        thrown.expectMessage("IP Address cannot be a null");
        thrown.expect(NullPointerException.class);
        Regex.isIpAddress(ipAddress);
    }

    @Test
    public void ChecksAllPossibleCorrectCombinationsForIndividualPartsSeparately() {
        String ipAddress;
        for (int i = 0; i <= 255; i++) {
            ipAddress = String.format("%d.%d.%d.%d", i, 1, 1, 1);
            assertTrue(Regex.isIpAddress(ipAddress));
            ipAddress = String.format("%d.%d.%d.%d", 1, i, 1, 1);
            assertTrue(Regex.isIpAddress(ipAddress));
            ipAddress = String.format("%d.%d.%d.%d", 1, 1, i, 1);
            assertTrue(Regex.isIpAddress(ipAddress));
            ipAddress = String.format("%d.%d.%d.%d", 1, 1, 1, i);
            assertTrue(Regex.isIpAddress(ipAddress));
        }
    }
}
