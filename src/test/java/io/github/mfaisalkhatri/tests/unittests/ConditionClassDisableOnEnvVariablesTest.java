package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
@DisabledIfEnvironmentVariables(value = {
        @DisabledIfEnvironmentVariable(named = "skiptest", matches = "true", disabledReason = "\n This test is disabled based on  env variable named 'skiptest'"),
        @DisabledIfEnvironmentVariable(named = "disabletest", matches = "yes", disabledReason = "\n This test is disabled based on  env variable named 'disabletest'")})
public class ConditionClassDisableOnEnvVariablesTest {
    @Test
    public void unitTestOne() {
        System.out.println("This is unit test one!!");
    }

    @Test
    public void unitTestTwo() {
        System.out.println("This is unit test two!!");
    }


}
