package Homework6.ShellSort;

public class ShellArraySort implements Runnable {
    private int[] array;
    private Thread thread;
    private int [] steps;

    public ShellArraySort(int[] array,int [] steps) {
        this.array = array;
        this.steps = steps;
        thread = new Thread(this);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        int j;
        int tmp;
        for (int s = 0; s <steps.length ; s++) {
            for (int i = 0; i < array.length; i += steps[s]) {
                tmp = array[i];
                for (j = i; j >= steps[s]; j -= steps[s]) {
                    if (tmp < array[j - steps[s]]) {
                        array[j] = array[j - steps[s]];
                    } else {
                        break;
                    }
                }
                array[j] = tmp;
            }
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
