package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
@DisabledOnOs(value = OS.MAC, architectures = "AArch64", disabledReason = "Fix is not available for MAC")
public class ConditionalDisableOnOSExampleTest {

    @Test
    public void unitTestOne() {
        System.out.println("This is unit test one!!");
    }

    @Test
    public void unitTestTwo() {
        System.out.println("This is unit test two!!");
    }

    @Test
    public void unitTestThree() {
        System.out.println("This is unit test three!!");
    }

}
