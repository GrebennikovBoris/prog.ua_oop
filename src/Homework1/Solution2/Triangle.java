package Homework1.Solution2;

public class Triangle {
    private double a;
    private double b;
    private double c;


    public double trianglePerimetr() {
        return a + b + c;
    }

    public double triangleArea() {
        double halfPerimetr = trianglePerimetr() / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b) * (halfPerimetr - c));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
