package Homework5.FileConnector;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileConnector {
    private File firstFile;
    private File secondFile;
    private File outFile;

    public FileConnector(File firstFile, File secondFile, File outFile) {
        this.firstFile = firstFile;
        this.secondFile = secondFile;
        this.outFile = outFile;
    }

    public FileConnector() {
    }

    public File getFirstFile() {
        return firstFile;
    }

    public void setFirstFile(File firstFile) {
        this.firstFile = firstFile;
    }

    public File getSecondFile() {
        return secondFile;
    }

    public void setSecondFile(File secondFile) {
        this.secondFile = secondFile;
    }

    public File connect() {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> firstFileWords = new ArrayList<>();
        ArrayList<String> secondFileWords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(firstFile)); BufferedReader reader1 = new BufferedReader(new FileReader(secondFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
            while (reader.ready()) {
                String[] f = reader.readLine().split(" .?!,[ ]");
                firstFileWords.addAll(Arrays.asList(f));
            }
            while (reader1.ready()) {
                String[] s = reader1.readLine().split(" .?!,[ ]");
                secondFileWords.addAll(Arrays.asList(s));
            }

            for (String word : firstFileWords) {
                if (secondFileWords.contains(word)) {
                    words.add(word);
                }
            }
            if (!outFile.exists()) outFile.createNewFile();
            for (String word : words) {
                writer.write(word);
                writer.write(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outFile;
    }
}
