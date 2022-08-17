package day15;

public class TestFraction {
    public static void main(String[] args) {
        try {
            System.out.println(1111);
            Fraction f = new Fraction(2, 0);
        }
        catch (Exception e) {
            System.out.println("In ra thong tin lan vet su co: ");
            e.printStackTrace();
            System.out.println(2222);
        }
        System.out.println(333);

//        Fraction f1 = new Fraction(6, 3);
//        Fraction f2 = new Fraction(6, 0);
    }
}
