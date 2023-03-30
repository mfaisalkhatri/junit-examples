package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledInNativeImage;

/**
 * @author Faisal Khatri
 * @since 3/30/2023
 **/
public class DisabledInNativeImageTest {

    @DisabledInNativeImage
    @Test
    public void unitTestOne() {
        System.out.println ("This is unit test one!");
    }
}
