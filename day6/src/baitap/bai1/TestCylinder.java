package baitap.bai1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.0);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.0, 3.5);
        System.out.println(cylinder);
    }
}
