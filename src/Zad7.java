import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zad7 {

    public static boolean isPhoneNumberValidate(String phoneNumber) {
        Pattern pattern = Pattern.compile("[0-9]{3}([:,\\- ])[0-9]{3}\\1[0-9]{3}");
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }


    public static void main(String[] args) {
        System.out.println("Number 999-999-123 -> " + isPhoneNumberValidate("999-999-123"));
        System.out.println("Number 999 9929-123 -> " + isPhoneNumberValidate("999 9929-123"));
        System.out.println("Number 1999:999-123 -> " + isPhoneNumberValidate("199:999-123"));
        System.out.println("Number 000 129 123 -> " + isPhoneNumberValidate("000 129 123"));
        System.out.println("Number 000:129:123 -> " + isPhoneNumberValidate("000:129:123"));

    }
}