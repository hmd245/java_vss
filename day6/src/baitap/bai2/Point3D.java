package baitap.bai2;

public class Point3D extends Point2D {
    private float z = 0.0f;

    // constructor
    public Point3D() {
        this.z = 1.3f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        //this.x = x;
        //this.y = y;
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr3D = new float[3];
        arr3D[0] = getX();
        arr3D[1] = getY();
        arr3D[2] = z;
        return arr3D;
    }

    @Override
    public String toString() {
        return "Mot Point3D voi " + getX() + ", " + getY() + " va " + getZ() ;
    }
}
