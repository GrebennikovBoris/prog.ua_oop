package Homework1.Solution3;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector();
        vector1.setX(4);
        vector1.setY(6);
        vector1.setZ(3);
        Vector vector2 = new Vector();
        vector2.setX(1);
        vector2.setY(4);
        vector2.setZ(3);
        Vector vector3 = new Vector();
        vector3.setX(2);
        vector3.setY(6);
        vector3.setZ(4);

        System.out.println("Vector1 = " + vector1);
        System.out.println("Vector2 = " + vector2);
        System.out.println("Vector3 = " + vector3);

        System.out.println("V1 + V2 = " + vector1.addition(vector2));
        System.out.println("V1 * V2 = " + vector1.scalarProduct(vector2));
        System.out.println("V1 x V2 = " + vector1.vectorProduct(vector2));

    }
}
