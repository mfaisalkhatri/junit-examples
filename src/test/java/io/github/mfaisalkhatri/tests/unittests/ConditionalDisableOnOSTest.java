package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
public class ConditionalDisableOnOSTest {

    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "This feature is available for MAC users only")
    @Test
    public void unitTestOne() {
        System.out.println("This is unit test one!!");
    }

    @DisabledOnOs(architectures = "amd64", disabledReason = "Feature not ready for amd64 architecture")
    @Test
    public void unitTestTwo() {
        System.out.println("This is unit test two!!");
    }

    @DisabledOnOs(value = OS.MAC, architectures = "AArch64", disabledReason = "Fix is not available for MAC")
    @Test
    public void unitTestThree() {
        System.out.println("This is unit test three!!");
    }

}
