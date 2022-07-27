package baitap.bai3;

public class TestPointMov {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(2, 3);
        System.out.println(point);

        MovablePoint mov = new MovablePoint();
        System.out.println(mov);

        mov = new MovablePoint(3, 8);
        System.out.println(mov);

        mov = new MovablePoint(1, 3, 4 , 5);
        System.out.println(mov);
    }

}
