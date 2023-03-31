package io.github.mfaisalkhatri.tests.junit4unittests;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Faisal Khatri
 * @since 3/31/2023
 **/

@Ignore("Feature is WIP")
public class IgnoreClassExampleTest {

    @Test
    public void unitTestOne () {
        System.out.println ("This is test one!");
    }

    @Test
    public void unitTestTwo () {
        System.out.println ("This is test two!");
    }
}
