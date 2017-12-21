package Homework2;

import Homework2.Shape.Shape;

import java.util.ArrayList;

public class Board {
    private ArrayList<Shape> shapes;

    public Board(Shape shape1, Shape shape2, Shape shape3, Shape shape4) {
        shapes = new ArrayList<>(4);
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        shapes.add(shape4);
    }

    public Board() {
        shapes = new ArrayList<>(4);
    }

    public void shapeRemove(int index) {
        shapes.remove(index);
    }

    public void shapeAdd(int index, Shape shape) {
        shapes.add(index, shape);
    }


    public void allShapesInfo() {
        System.out.println(toString());
        double totalArea = 0;
        for (Shape shape : shapes) {
            if(shape!=null){
                totalArea+=shape.getArea();
            }
        }
        System.out.println("Total area is " + totalArea);

    }

    @Override
    public String toString() {
        return "Board{" +
                "shapes=" + shapes +
                '}';
    }
}
