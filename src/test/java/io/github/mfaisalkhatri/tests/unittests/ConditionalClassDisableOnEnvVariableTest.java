package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;

/**
 * @author Faisal Khatri
 * @since 3/27/2023
 **/
@DisabledIfEnvironmentVariable (named = "disabletest", matches = "yes",
    disabledReason = "\nThis test is disabled based on env variable named 'disabletest'")
public class ConditionalClassDisableOnEnvVariableTest {
    @Test
    public void unitTestOne () {
        System.out.println ("This is unit test one!!");
    }

    @Test
    public void unitTestTwo () {
        System.out.println ("This is unit test two!!");
    }
}
