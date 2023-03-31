package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;

/**
 * @author Faisal Khatri
 * @since 3/27/2023
 **/
public class ConditionalDisableOnSystemPropertiesTest {

    @DisabledIfSystemProperties (value = {
        @DisabledIfSystemProperty (named = "username", matches = "faisal", disabledReason = "This test is disabled \n based on system property 'username'"),
        @DisabledIfSystemProperty (named = "unittest", matches = "one", disabledReason = "This test is disabled \n based on system property 'unitest'") })
    @Test
    public void unitTestOne () {
        System.out.println ("This is test one!!");
    }

    @Test
    public void unitTestTwo () {
        System.out.println ("This is test two!!");
    }
}
