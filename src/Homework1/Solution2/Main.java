package Homework1.Solution2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println(triangle1 + " has area " + triangle1.triangleArea());
        Triangle triangle2 = new Triangle(5.0, 6.0, 7.0);
        System.out.println(triangle2 + " has area " + triangle2.triangleArea());
        Triangle triangle3 = new Triangle(7.0, 8.0, 9.0);
        System.out.println(triangle3 + " has area " + triangle3.triangleArea());
    }
}
