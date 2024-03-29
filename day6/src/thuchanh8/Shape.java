package thuchanh8;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    // Constructor không tham số
    public Shape() {

    }

    // Constructor có 2 tham số truyền vào
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter, setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Được cài đè phương thức toString
    // trả về chuỗi ký tự theo mẫu "A Shape with color of xxx and filled/not filled".

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }


}
