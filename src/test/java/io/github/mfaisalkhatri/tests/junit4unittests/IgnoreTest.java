package io.github.mfaisalkhatri.tests.junit4unittests;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Faisal Khatri
 * @since 3/31/2023
 **/
public class IgnoreTest {

    @Ignore ("Feature is WIP")
    @Test
    public void testOne () {
        System.out.println ("This is test one!");
    }

    @Test
    public void testTwo () {
        System.out.println ("This is test two!");
    }

}