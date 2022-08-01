package baitap.bai2;

/*
[Bài tập] Lớp Point2D và lớp Point3D
Luyện tập kỹ năng đọc và triển khai bản thiết kế lớp đối tượng bằng giản đồ.
 */

public class Point2D {
    // Property - Private instance variable
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructors
    // contructor mặc định không tham số
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    // constructor có 2 tham số truyền vào
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters, setters
    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // !!!!!!!!!!!!!
    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    @Override
    public String toString() {
        return "Mot Point2D voi " + getX() + " va " + getY();
    }


}
