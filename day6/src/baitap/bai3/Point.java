package baitap.bai3;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    //constructor
    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // getter, setter
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arrPoint = new float[2];
        arrPoint[0] = x;
        arrPoint[1] = y;
        return arrPoint;
    }

    @Override
    public String toString() {
        return "A Point with (" + getX() + ", " + getY() + ")";
    }

}
