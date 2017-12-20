package Homework1.Solution2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        triangle1.setA(3.0);
        triangle1.setB(4.0);
        triangle1.setC(5.0);
        System.out.println(triangle1 + " has area " + triangle1.triangleArea());
        Triangle triangle2 = new Triangle();
        triangle2.setA(5.0);
        triangle2.setB(6.0);
        triangle2.setC(7.0);
        System.out.println(triangle2 + " has area " + triangle2.triangleArea());
        Triangle triangle3 = new Triangle();
        triangle3.setA(7.0);
        triangle3.setB(8.0);
        triangle3.setC(9.0);
        System.out.println(triangle3 + " has area " + triangle3.triangleArea());
    }
}
