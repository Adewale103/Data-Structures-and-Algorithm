package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        String regex = "(^(\\+)?234[\\( ]?[0-9]{3}\\)? ?[0-9]{3}[\\- ]?[0-9]{4})|(^[0-9]{4}[\\- ]?[0-9]{3}[\\- ]?[0-9]{4})|(^01 ?[0-9]{3} ?[0-9]{4})|(^\\+234 1 [0-9]{3} [0-9]{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("+2349021806462");
        System.out.println( matcher.matches());
    }
}
