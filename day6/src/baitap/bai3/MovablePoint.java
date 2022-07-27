package baitap.bai3;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // constructor
    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // getters, setters
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arrMovable = new float[2];
        arrMovable[0] = xSpeed;
        arrMovable[1] = ySpeed;
        return arrMovable;
    }

    // move() ??????????????
    public float[] move() {
        this.setX(super.getX() + this.xSpeed);
        this.setY(super.getY() + this.ySpeed);
        return this.getXY();
    }

    @Override
    public String toString() {
        return "A MovablePoint with (" + getX() + ", " + getY() + ", " + getxSpeed() + ", " + getySpeed() + ")";
    }

}
