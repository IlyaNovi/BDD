package data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }



    public static AuthInfo getValidAuthInfo() {

        return new AuthInfo("vasya", "qwerty123");
    }

    public static VerificationCode getValidVerificationCodeFor() {

        return new VerificationCode("12345");
    }

    public static String firstCardNumber() {

        String number = "5559 0000 0000 0001";
        return number;
    }

    public static String secondCardNumber() {

        String number = "5559 0000 0000 0002";
        return number;
    }

    public static String invalidCardNumber() {
        String number = "1223 4444 5555 1234";
        return number;
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    @Value
    public static class VerificationCode {
        private String code;
    }
}