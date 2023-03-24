package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.properties.SystemProperties;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/

public class SystemPropertyVariableConditionDisableTest {

    @SystemStub
    private SystemProperties systemProperties = new SystemProperties ().set ("username", "khatrif");

    @DisabledIfSystemProperty (named = "LT_USERNAME", matches = "faisal", disabledReason = "This test is disabled based on system property 'LT_USERNAME'")
    @Test
    public void unitTestOne () {
        System.out.println ("This is test one!!");
    }

    @DisabledIfSystemProperties (value = {
        @DisabledIfSystemProperty (named = "username", matches = "khatrif", disabledReason = "This test is disabled based on system property 'username'"),
        @DisabledIfSystemProperty (named = "LT_USERNAME", matches = "faisal", disabledReason = "This test is disabled based on system property 'LT_USERNAME'") })
    @Test
    public void unitTestTwo () {
        System.out.println ("This is test two!!");
    }

    @Test
    public void unitTestThree() {
        System.out.println("This is test three!");
    }
}
