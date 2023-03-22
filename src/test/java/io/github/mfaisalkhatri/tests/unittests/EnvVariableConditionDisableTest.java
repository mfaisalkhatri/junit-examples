package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;
import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
@ExtendWith (SystemStubsExtension.class)
public class EnvVariableConditionDisableTest {

    @SystemStub
    private EnvironmentVariables variables = new EnvironmentVariables ("disabletest", "yes");

    @DisabledIfEnvironmentVariable (named = "disabletest", matches = "yes", disabledReason = "this test is disabled based on  env variable named 'disabletest'")
    @Test
    public void unitTestOne () {
        System.out.println ("This is unit test one!!");
    }

}
