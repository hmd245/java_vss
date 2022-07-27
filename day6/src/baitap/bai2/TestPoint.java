package baitap.bai2;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(2.5f, 2.8f);
        System.out.println(point2D);

        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(3.1f, 3.2f, 3.3f);
        System.out.println(point3D);
    }
}
