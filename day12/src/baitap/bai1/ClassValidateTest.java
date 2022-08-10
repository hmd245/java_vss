package baitap.bai1;

public class ClassValidateTest {
    private static ClassValidate classValidate;
    public static final String[] validClass = new String[] { "C0318G", "A0318G", "P0318G" };
    public static final String[] invalidClass = new String[] { "M0318G", "P0323A" };

    public static void main(String args[]) {
        classValidate = new ClassValidate();
        for (String class1 : validClass) {
            boolean isvalid = classValidate.validate(class1);
            System.out.println("Class is " + class1 +" is valid: "+ isvalid);
        }
        for (String class1 : invalidClass) {
            boolean isvalid = classValidate.validate(class1);
            System.out.println("Class is " + class1 +" is valid: "+ isvalid);
        }
    }
}
