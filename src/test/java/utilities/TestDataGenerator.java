package utilities;

import com.github.javafaker.Faker;

public class TestDataGenerator {

    private static Faker faker = new Faker();

    public static String generateLiteralPassword() {
        return faker.letterify("????????????");
    }

    public static String generateNumericPassword() {
        return faker.numerify("############");
    }

    public static String generateUsername() {
        return faker.name().username();
    }
}
