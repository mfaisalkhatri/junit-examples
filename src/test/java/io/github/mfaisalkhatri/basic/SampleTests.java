package io.github.mfaisalkhatri.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * @author Faisal Khatri
 * @since 10/21/2022
 **/
public class SampleTests {

    @Test
    public void testOne () {
        System.out.println ("This is a new test");
    }

    @TestInstance (TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class nestedTest {
        @BeforeAll
        void nestedBeforeAll () {
            System.out.println ("Before All in nested class");
        }

        @Test
        void nestedTest () {
            System.out.println ("This is a nested test");
        }

    }
}
