// Tao lop QuadraticEquation, khai bao cac thuoc tinh(properties), dinh nghia cac phuong thuc khoi tao(contructors)

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Dinh nghia phuong thuc getter cho a, b, c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Dinh nghia phuong thuc getDiscriminant() tra ve delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Phuong thuc getRoot1() va getRoot2 tra ve 2 nghiem
    public double getRoot1() {
        double x1 = ((-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a));
        //return Math.pow(getDiscriminant(), 0.5);
        return x1;
    }

    public double getRoot2() {
        double x2 = ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
        return x2;
    }
}
