package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/

@DisabledIfSystemProperty (named = "username", matches = "faisal", disabledReason = "This test is disabled at class level \n based on system property 'username'")
public class ConditionalClassDisableOnSystemPropertyVariableTest {

    @Test
    public void unitTestOne () {
        System.out.println ("This is test one!!");
    }

    @Test
    public void unitTestTwo () {
        System.out.println ("This is test two!");
    }
}
