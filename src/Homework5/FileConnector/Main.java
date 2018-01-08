package Homework5.FileConnector;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileConnector connector = new FileConnector(new File(args[0]), new File(args[1]), new File(args[2]));
        connector.connect();
    }
}
