package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

public class ConditionalDisableOnJreRangeTest {

    @DisabledForJreRange(min = JRE.JAVA_11)
    @Test
    public void unitTestOne() {
        System.out.println("This is unit test one!!");
    }

    @DisabledForJreRange(max = JRE.JAVA_9)
    @Test
    public void unitTestTwo() {
        System.out.println("This is unit test two!!");
    }

    @DisabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_11)
    @Test
    public void unitTestThree() {
        System.out.println("This is unit test three!!");
    }

}
