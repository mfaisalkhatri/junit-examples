package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
public class DisabledIfTest {

    @DisabledIf ("customCondition")
    @Test
    public void unitTestOne () {

        System.out.println ("This test is unit test one!!");
    }
    boolean customCondition () {
        return System.getProperty ("LT_USERNAME")
            .contains ("faisal");
    }
}