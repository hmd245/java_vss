package day15;

// Ném và bắt ngoại lệ
public class Fraction {
    private int numerator;
    private int denominator;

//    public Fraction (int n, int d) {
//        numerator = n;
//        denominator = d;
//        System.out.println(n/d);
//    }

    public Fraction (int n, int d) throws Exception {
        if (d == 0) {
            throw new Exception();
        }

        numerator = n;
        denominator = d;

        System.out.println(n/d);
    }



}
