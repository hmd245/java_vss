package baitap;

public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng circle
        Circle circle = new Circle();

        // Truy cập các phương thức getRadius() và getArea().
        // Nếu là private thì không thể truy cập ở đây
        // Nếu là default thì có thể truy cập vì cùng package
        // Nếu là protected thì có thể truy cập trong cùng packge/subclass ở đây
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

    }
}
