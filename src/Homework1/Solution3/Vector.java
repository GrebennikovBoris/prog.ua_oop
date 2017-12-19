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

    public Vector addition(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public double scalarProduct(Vector vector) {
        return (x * vector.x) + (y * vector.y) + (z * vector.z);
    }

    public Vector vectorProduct(Vector v) {
        return new Vector((y * v.z) - (z * v.y), (z * v.x) - (x * v.z),
                (x * v.y) - (y * v.x));
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
