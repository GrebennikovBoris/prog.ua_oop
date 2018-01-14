package Homework6.ArraySum;

public class MultiThreadArraySum {
    public static void sum(int[] array, int threadNumber) {
        System.out.println("Количество нитей : " + threadNumber );
        ArraySumThread[] arraySumThreads = new ArraySumThread[threadNumber];
        int sum = 0;
        for (int i = 0; i < arraySumThreads.length; i++) {
            int size = array.length / threadNumber;
            int begin = size * i;
            int end = ((i + 1) * size);
            if ((array.length - end) < size) {
                end = array.length;
            }
            arraySumThreads[i] = new ArraySumThread(array, begin, end);
        }
        for (int j = 0; j < arraySumThreads.length; j++) {
            try {
                arraySumThreads[j].getThread().join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum += arraySumThreads[j].getSum();
        }
        System.out.println("Сумма массива равна : " + sum);
    }

}
