package Homework6.ShellSort;

public class MultiThreadShellSort {
    static void sort(int[] array, int[] steps, int threadNumber) {
        System.out.println("Количество нитей : " + threadNumber);
        ShellArraySort[] shellArraySorts = new ShellArraySort[threadNumber];
        for (int i = 0; i < shellArraySorts.length; i++) {
            shellArraySorts[i] = new ShellArraySort(array, steps);
        }
        for (int j = 0; j < shellArraySorts.length; j++) {
            try {
                shellArraySorts[j].getThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
