package baitap.bai2d7;

//Bước 1: Tạo mã kiểm thử cho interface Colorable

public class ColorableTest {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        Rectangle r1 = new Rectangle(3,11);
        Circle c1 = new Circle();

        Shape[] shapes = new Shape[3];
        shapes[0] = s1;
        shapes[1] = r1;
        shapes[2] = c1;

        for (Shape i : shapes){
            System.out.println(i.getArea());
            if (i instanceof Square){
                Square t = (Square) i;
                t.howToColor();
            }
            System.out.println("------------------");
        }
    }
}