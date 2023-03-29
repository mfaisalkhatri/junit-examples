package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;
import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;

/**
 * @author Faisal Khatri
 * @since 3/27/2023
 **/
public class ConditionalDisableOnEnvVariablesTest {

    @DisabledIfEnvironmentVariables (value = {
        @DisabledIfEnvironmentVariable (named = "skiptest", matches = "true", disabledReason = "\nThis test is disabled based on  env variable named 'skiptest'"),
        @DisabledIfEnvironmentVariable (named = "disabletest", matches = "yes", disabledReason = "\nThis test is disabled based on  env variable named 'disabletest'") })
    @Test
    public void unitTestOne () {
        System.out.println ("This is unit test one!!");
    }

    @Test
    public void unitTestTwo () {
        System.out.println ("This is unit test two!!");
    }
}
