package io.github.mfaisalkhatri.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * @author Faisal Khatri
 * @since 11/4/2022
 **/
@TestInstance (TestInstance.Lifecycle.PER_CLASS)
public class SampleClass {

    @BeforeAll
    public void beforeAllTest () {
        System.out.println ("This is the before all method from outer class");
    }

    @Test
    public void testOneFromOuterClass () {
        System.out.println ("This is test one from outer class");
    }

    @Test
    public void testTwoFromOuterClass () {
        System.out.println ("This is test two from outer class");
    }

    @Nested
    @TestInstance (TestInstance.Lifecycle.PER_CLASS)
    class nestedClass {
        @BeforeAll
        public void beforeAllNestedTest () {
            System.out.println ("This is before all method from nested class!");
        }

        @Test
        public void testOne () {
            System.out.println ("This is first test of nested class!");
        }

        @Test
        public void testTwo () {
            System.out.println ("This is second test of nested class!");
        }
        @AfterAll
        public void afterAllNestedTest () {
            System.out.println ("This is the after all method from nested class");

        }
    }

    @AfterAll
    public void afterAllTest () {
        System.out.println ("This is the before all method from outer class");
    }
}
