package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

@DisabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_15, disabledReason = "Tests disabled for JRE range 9 - 15")
public class ConditionalClassDisableOnJreRangeTest {
    @Test
    public void unitTestOne() {
        System.out.println("This is unit test one!!");
    }

    @Test
    public void unitTestTwo() {
        System.out.println("This is unit test two!!");
    }
}
