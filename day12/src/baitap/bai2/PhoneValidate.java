package baitap.bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidate {
    private static Pattern pattern;
    private Matcher matcher;

    //private static final String PHONE_REGEX = "^\\d{2}-0[0-9]{9}$";
    private static final String PHONE_REGEX = "^\\(\\d{2} \\)-\\(0[0-9]{9}\\)$";

    public PhoneValidate() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
