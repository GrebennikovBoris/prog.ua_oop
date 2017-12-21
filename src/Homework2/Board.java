package Homework2;

import Homework2.Shape.Shape;


public class Board {
    private final int SIZE = 4;
    private Shape[] shapes;

    public Board() {
        shapes = new Shape[SIZE];
    }


    public void shapeRemove(int index) {
        if (index >= 0 && index < SIZE) {
            shapes[index] = null;
        }
    }

    public void shapeAdd(int index, Shape shape) {
        if (shape != null && index >= 0 && index < SIZE) {
            shapes[index] = shape;
        }else {
            System.out.println("Wrong index");
        }
    }


    public void allShapesInfo() {
        System.out.println(toString());
        double totalArea = 0;
        for (Shape shape : shapes) {
            if (shape != null) {
                totalArea += shape.getArea();
            }
        }
        System.out.println("Total area is " + totalArea);

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Shape shape : shapes) {
            if (shape != null) {
                s.append(shape).append(" ");
            }
        }
        return "Board{" +
                "shapes= " + s +
                '}';
    }
}
