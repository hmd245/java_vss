package baitap.bai1;

public class Circle {
    // property
    private double radius = 1.0;
    private String color = "black";

    // contructor
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // getter, setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // getArea
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    // Ghi đè phương thức toString để in ra thông tin chi tiết các thuộc tính của đối tượng
    @Override
    public String toString() {
        return "Hinh tron voi ban kinh = " + getRadius();
    }

}
