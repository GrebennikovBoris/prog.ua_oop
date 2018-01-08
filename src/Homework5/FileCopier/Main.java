package Homework5.FileCopier;

public class Main {
    public static void main(String[] args) {
        FileCopier copier = new FileCopier();
        copier.setFirstFolder("C:\\first");
        copier.setSecondFolder("C:\\second");
//        copier.setExpansion(".txt");
        copier.setExpansion(".png");
        copier.copy();
    }
}
