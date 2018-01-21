package Homework7.MultiThreadCopy;

public class Main {
    public static void main(String[] args) {
        MultiThreadFileCopy multiThreadFileCopy = new MultiThreadFileCopy("C:\\file.txt","C:\\temp");
        multiThreadFileCopy.fileCopy();
    }
}
