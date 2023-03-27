package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

/**
 * @author Faisal Khatri
 * @since 3/27/2023
 **/
public class ConditionalDisableClassOnEnvVariableTest {

    @DisabledIfEnvironmentVariable (named = "disabletest", matches = "yes", disabledReason = "this test is disabled based on  env variable named 'disabletest'")
    @Test
    public void unitTestOne () {
        System.out.println ("This is unit test one!!");
    }

    @Test
    public void unitTestTwo () {
        System.out.println ("This is unit test two!!");
    }

}
