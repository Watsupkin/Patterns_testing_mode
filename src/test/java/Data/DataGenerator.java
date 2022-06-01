package Data;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {

    private static Faker faker = new Faker(new Locale("en"));

    private DataGenerator() {}

    @Value
    @Data
    @AllArgsConstructor
    public static class UserInfo {
        private String login;
        private String password;
        private String status;
    }

    public static UserInfo getUserRegInfoActive() {
        return new UserInfo(faker.name().username(),
                faker.internet().password(),
                "active");
    }

    public static UserInfo getUserInfoBlocked() {
        return new UserInfo(faker.name().username(),
                faker.internet().password(),
                "blocked");
    }

    public static String getInvalidLogin() {
        return faker.name().username();
    }

    public static String getInvalidPassword() {
        return faker.internet().password();
    }
}
