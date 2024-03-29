package io.github.mfaisalkhatri.lambdatestcommerce.data;


import net.datafaker.Faker;

/**
 * Created By Faisal Khatri on 25-07-2022
 */
public class TestDataBuilder {

    private static final Faker FAKER = new Faker();
    public static RegisterUserData getRegisterUserData () {
        return RegisterUserData.builder ()
            .firstName (FAKER.name ()
                .firstName ())
            .lastName (FAKER.name ()
                .lastName ())
            .email (FAKER.internet ()
                .emailAddress ())
            .telephone (String.valueOf (FAKER.number ()
                .numberBetween (9000000000L, 9999999999L)))
            .build ();
    }
}