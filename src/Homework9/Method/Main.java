package Homework9.Method;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        ArrayList<String> list = new ArrayList<>();
        list.add("F");
        list.add("g");
        list.add("H");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");
        list.add("5");
        list.remove(0);
        list.remove(0);
        list.remove(list.size() - 1);
        for (String s : list) {
            System.out.print(s + " ");
        }

    }
}
