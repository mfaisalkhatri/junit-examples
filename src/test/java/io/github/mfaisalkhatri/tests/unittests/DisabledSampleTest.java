package io.github.mfaisalkhatri.tests.unittests;

import java.util.Map;
import java.util.Properties;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author Faisal Khatri
 * @since 3/22/2023
 **/
public class DisabledSampleTest {

    @Disabled ("This test is disabled as the feature is WIP")
    @Test
    public void sampleTestDisabled () {
        System.out.println ("Disabled Test");
    }

    @Test
    public void sampleUnitTest () {
        System.out.println ("This is a working test");
    }

}