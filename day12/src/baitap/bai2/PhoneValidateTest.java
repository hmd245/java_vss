package baitap.bai2;

public class PhoneValidateTest {
    private static PhoneValidate phoneValidate;
    public static final String[] validPhone = new String[] {"(84)-(0978489648)","84-0978489648"};
    public static final String[] invalidPhone = new String[] {"(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneValidate = new PhoneValidate();

        for (String phone1 : validPhone) {
            boolean isvalid = phoneValidate.validate(phone1);
            System.out.println("Sdt " + phone1 + " is valid " + isvalid);
        }

        for (String phone1 : invalidPhone) {
            boolean isvalid = phoneValidate.validate(phone1);
            System.out.println("Sdt " + phone1 + " is valid " + isvalid);
        }
    }
}
