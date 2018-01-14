package Homework6.ArraySum;

public class ArraySumThread implements Runnable {
    private int begin;
    private int end;
    private Thread thread;
    private int[] array;
    private int sum;
    private boolean stop = false;

    public ArraySumThread(int[] array, int begin, int end) {
        this.array = array;
        this.begin = begin;
        this.end = end;
        thread = new Thread(this);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    public int getSum() {
        return sum;
    }

    public boolean isStop() {
        return stop;
    }

    @Override
    public void run() {
        for (int i = begin; i < end; i++) {
            if (i + 1 == end) stop = true;
            sum += array[i];
        }
        System.out.println("Сумма потока " + thread.getName() + " " + sum);
    }

}
