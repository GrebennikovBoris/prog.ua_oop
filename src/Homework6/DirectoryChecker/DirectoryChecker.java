package Homework6.DirectoryChecker;

import java.io.File;

public class DirectoryChecker implements Runnable {
    private File directory;
    private Thread thread;
    private int filesCount;

    public DirectoryChecker(String s) {
        directory = new File(s);
        filesCount = directory.listFiles().length;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        if (directory.isDirectory()) {
            while (true) {
                try {
                    if (filesCount < directory.listFiles().length) {
                        System.out.println("You got " + (directory.listFiles().length - filesCount) + " file(s)");
                    }
                    if (filesCount > directory.listFiles().length) {
                        System.out.println("You lost " + (filesCount - directory.listFiles().length) + " file(s)");
                    }
                    filesCount = directory.listFiles().length;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Directory is wrong!");
        }
    }
}
