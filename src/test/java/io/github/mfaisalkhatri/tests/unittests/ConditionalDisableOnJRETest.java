package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
public class ConditionalDisableOnJRETest {

    @DisabledOnJre (JRE.JAVA_15)
    @Test
    public void unitTestOne () {
        System.out.println ("This is unit test one!!");
    }

    @DisabledForJreRange (min = JRE.JAVA_15)
    @Test
    public void unitTestTwo () {
        System.out.println ("This is unit test two!!");
    }

    @DisabledForJreRange (max = JRE.JAVA_15)
    @Test
    public void unitTestThree () {
        System.out.println ("This is unit test three!!");
    }

    @DisabledForJreRange (min = JRE.JAVA_9, max = JRE.JAVA_15)
    @Test
    public void unitTestFour () {
        System.out.println ("This is unit test four!!");
    }
}
