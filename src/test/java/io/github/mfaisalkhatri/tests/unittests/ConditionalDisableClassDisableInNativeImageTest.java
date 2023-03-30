package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledInNativeImage;

/**
 * @author Faisal Khatri
 * @since 3/30/2023
 **/
@DisabledInNativeImage
public class ConditionalDisableClassDisableInNativeImageTest {

    @Test
    public void unitTestOne () {
        System.out.println ("This is unit test one!");
    }

    @Test
    public void unitTestTwo () {
        System.out.println ("This is unit test two!");
    }
}

