package baitap.bai1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassValidate {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[CAP]\\d{4}[GHIKLM]$";

    public ClassValidate() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
