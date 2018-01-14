package Homework6.ShellSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = randomArray();
        MultiThreadShellSort.sort(array, new int[]{5, 3, 1}, 5);

    }

    private static int[] randomArray() {
        int MAX_SIZE = 1000;
        int[] arr = new int[MAX_SIZE];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
