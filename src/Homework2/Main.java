package Homework2;

import Homework2.Shape.Rectangle;
import Homework2.Shape.Square;
import Homework2.Shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(15, 15), new Point(23, 30), new Point(50, 25));
        Square square = new Square(new Point(4, 4), new Point(4, -4), new Point(-4, -4), new Point(-4, 4));
        Rectangle rectangle1 = new Rectangle(new Point(-5, 5), new Point(5, 5), new Point(5, -2), new Point(-5, -2));
        Rectangle rectangle2 = new Rectangle(new Point(-7, 7), new Point(7, 7), new Point(7, -4), new Point(-7, -4));
        Board board = new Board();
        board.shapeAdd(0,triangle);
        board.shapeAdd(1,square);
        board.shapeAdd(2,rectangle1);
        board.shapeAdd(3,rectangle2);
        board.allShapesInfo();
        board.shapeRemove(2);
        board.allShapesInfo();

    }
}
