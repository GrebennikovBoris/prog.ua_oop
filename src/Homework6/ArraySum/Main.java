package Homework6.ArraySum;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        long start = System.currentTimeMillis();
        MultiThreadArraySum.sum(array, 10);
        long end = System.currentTimeMillis();
        System.out.println("Посчитало за : " + (end - start) + " мс");
        int sum = 0;
        start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма простого алгоритма - " + sum);
        end = System.currentTimeMillis();
        System.out.println("Посчитало за : " + (end - start) + " мс");
    }
}
