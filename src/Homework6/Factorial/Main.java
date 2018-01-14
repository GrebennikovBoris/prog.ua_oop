package Homework6.Factorial;

public class Main {
    public static void main(String[] args) {
        FactorialThread [] threads = new FactorialThread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new FactorialThread();
            threads[i].start();
        }
    }
}
