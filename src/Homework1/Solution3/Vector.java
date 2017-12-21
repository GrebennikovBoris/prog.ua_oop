package Homework1.Solution3;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String addition(Vector vector) {
        return "Vector{x="+(x + vector.getX()) + ", y=" + (y + vector.getY()) + ", z=" + (z + vector.getZ())+"}";
    }

    public String scalarProduct(Vector vector) {
        return "" + (double)((x * vector.getX()) + (y * vector.getY()) + (z * vector.getZ()));
    }

    public String vectorProduct(Vector v) {
        return "Vector{x="+((y * v.z) - (z * v.y)) + ", y=" + ((z * v.x) - (x * v.z)) + ", z=" +
                ((x * v.y) - (y * v.x))+ "}";
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
