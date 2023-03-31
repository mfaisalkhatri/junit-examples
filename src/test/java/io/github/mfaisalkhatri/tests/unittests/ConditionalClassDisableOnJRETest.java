package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
@DisabledOnJre(value = JRE.JAVA_11, disabledReason = "This class is disabled when running on Java 11")
public class ConditionalClassDisableOnJRETest {

    @Test
    public void unitTestOne() {
        System.out.println("This is unit test one!!");
    }

    @Test
    public void unitTestTwo() {
        System.out.println("This is unit test two");
    }
}
