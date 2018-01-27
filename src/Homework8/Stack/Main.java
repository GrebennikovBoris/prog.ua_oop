package Homework8.Stack;

import Homework1.Solution1.Cat;
import Homework1.Solution2.Triangle;
import Homework1.Solution3.Vector;
import Homework2.Board;
import Homework3.Group;
import Homework3.Student;
import Homework8.BlackList.BlackList;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.setList(new BlackList());
        container.push(new Student());
        container.push(new Group());
        container.push(new Cat());
        container.push(new Triangle());
        container.push(new Vector());
        container.push(new Board());
        container.pool();
        container.pool();
        container.pool();
        container.pool();

    }
}
