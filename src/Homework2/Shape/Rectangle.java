package Homework2.Shape;

import Homework2.Point;

public class Rectangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public double getArea() {
        double firstSide, secondSide;
        firstSide = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        secondSide = Math.sqrt(Math.pow(a.getX() - d.getX(), 2) + Math.pow(a.getY() - d.getY(), 2));
        return firstSide * secondSide;
    }

    @Override
    public double getPerimetr() {
        double firstSide, secondSide;
        firstSide = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        secondSide = Math.sqrt(Math.pow(a.getX() - d.getX(), 2) + Math.pow(a.getY() - d.getY(), 2));
        return (firstSide + secondSide) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
