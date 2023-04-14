package io.github.mfaisalkhatri.tests.unittests;

import org.junit.jupiter.api.Test;

public class SyntaxSamplesTest {

    @Test
    public void getArchDetails() {
        System.out.println(System.getProperty("os.arch"));
    }

    @Test
    public void getEnvDetails () {
        System.getenv().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
    }

}
