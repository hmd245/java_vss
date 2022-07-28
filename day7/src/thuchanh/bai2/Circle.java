package thuchanh.bai2;

public class Circle {
    // property
    private double radius = 1.0;
    private String color = "black";
    private boolean filled = true;


    // constructor
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle (double radius, String color, Boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    // getters, setters
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

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
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
