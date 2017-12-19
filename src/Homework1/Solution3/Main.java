package Homework1.Solution3;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(4, 6, 3);
        Vector vector2 = new Vector(1, 4, 3);
        Vector vector3 = new Vector(2, 6, 4);

        System.out.println("Vector1 = " + vector1);
        System.out.println("Vector2 = " + vector2);
        System.out.println("Vector3 = " + vector3);

        System.out.println("V1 + V2 = " + vector1.addition(vector2));
        System.out.println("V1 * V2 = " + vector1.scalarProduct(vector2));
        System.out.println("V1 x V2 = " + vector1.vectorProduct(vector2));

    }
}
