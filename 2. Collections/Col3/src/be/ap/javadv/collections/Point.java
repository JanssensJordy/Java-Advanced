package be.ap.javadv.collections;

public class Point {
    private float x;
    private float y;
    private float z;

    public Point(float x, float y, float z) {
        setX(x);;
        setY(y);
        setZ(z);
    }

    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }
    private void setX(float x) {
        this.x = (x < 9.5 & x >= 0)? x : 9;
    }
    private void setY(float y) {
        this.y = (y < 9.5 & y >= 0)? y : 9;
    }
    private void setZ(float z) {
        this.z = (z < 9.5 & z >= 0)? z : 9;
    }

    @Override
    public int hashCode() {
        return 100*Math.round(x) + 10*Math.round(y) + Math.round(z);
    }
}