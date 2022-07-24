package baitap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    final float pi = 3.14f;

    // Hàm tạo không tham số
    public Circle(){

    }

    // Hàm tạo có tham số là radius
    public Circle(double r) {
        radius = r;
    }

    // Hai phương thức có access modifier là public: getRadius và getArea
//    private double getRadius() {
//        return radius;
//    }
    double getRadius() {
        return radius;
    }
//    protected double getRadius() {
//        return radius;
//    }
//    public double getRadius() {
//        return radius;
//    }

    public double getArea() {
        return radius * radius * pi;
    }

    public static void main(String[] args) {
        // Tạo đối tượng circle
        Circle circle = new Circle();

        // Truy cập các phương thức getRadius() và getArea().
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

    }

}
