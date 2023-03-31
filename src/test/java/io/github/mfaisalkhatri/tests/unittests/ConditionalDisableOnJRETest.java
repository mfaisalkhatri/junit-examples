package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
public class ConditionalDisableOnJRETest {

    @DisabledOnJre(value = JRE.JAVA_11, disabledReason = "JRE 11 support will be provided in next release, till time, test disabled")
    @Test
    public void unitTestOne() {
        System.out.println("This is unit test one!!");
    }

    @DisabledOnJre(JRE.JAVA_15)
    @Test
    public void unitTestTwo() {
        System.out.println("This is unit test two");
    }
}
