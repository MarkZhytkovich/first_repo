package prepare_data;

import models.SwagLabsLoginModel;
import utilities.TestDataGenerator;

public class PrepareLoginData {

    public static SwagLabsLoginModel getStandardUserData() {
        return SwagLabsLoginModel
                .builder()
                .username("standard_user")
                .password("secret_sauce")
                .build();
    }

    public static SwagLabsLoginModel getLockedUserData() {
        return SwagLabsLoginModel
                .builder()
                .username("locked_out_user")
                .password("secret_sauce")
                .build();
    }

    public static SwagLabsLoginModel getProblemUserData() {
        return SwagLabsLoginModel
                .builder()
                .username("problem_user")
                .password("secret_sauce")
                .build();
    }

    public static SwagLabsLoginModel getGlitchUserData() {
        return SwagLabsLoginModel
                .builder()
                .username("performance_glitch_user")
                .password("secret_sauce")
                .build();
    }

    public static SwagLabsLoginModel getRandomUsernameUser() {
        return SwagLabsLoginModel
                .builder()
                .username(TestDataGenerator.generateUsername())
                .password("secret_sauce")
                .build();
    }

    public static SwagLabsLoginModel getUserWithNumericPassword() {
        return SwagLabsLoginModel
                .builder()
                .username("standard_user")
                .password(TestDataGenerator.generateNumericPassword())
                .build();
    }

    public static SwagLabsLoginModel getUserWIthLiteralPassword() {
        return SwagLabsLoginModel
                .builder()
                .username("standard_user")
                .password(TestDataGenerator.generateLiteralPassword())
                .build();
    }
}
