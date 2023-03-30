package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
@DisabledIf (value = "customCondition", disabledReason = "Test disabled as custom condition evaluated to true")
public class DisabledIfClassCustomConditionTest {

    static boolean customCondition () {
        return System.getProperty ("username")
            .contains ("faisal");
    }

    @Test
    public void unitTestOne () {

        System.out.println ("This unit test one!!");
    }

}
