package Homework5.FileCopier;

import java.io.*;

public class FileCopier implements FileFilter {
    private File firstFolder;
    private File secondFolder;
    private String expansion;

    public void copy() {
        if (!firstFolder.isDirectory() || !firstFolder.exists()) {
            System.out.println("Main directory doesn't exist or it doesn't directory");
            return;
        }
        if (!secondFolder.isDirectory()) {
            System.out.println("Out folder doesn't directory!");
            return;
        }
        if (!secondFolder.exists()) {
            secondFolder.mkdir();
        }
        for (File f : firstFolder.listFiles()) {
            File workFile = new File(secondFolder + "/" + f.getName());
            if (accept(f)) {
                if (workFile.exists()) workFile.delete();
                try (BufferedReader reader = new BufferedReader(new FileReader(f)); BufferedWriter writer = new BufferedWriter(new FileWriter(workFile))) {
                    while (reader.ready()) {
                        char[] b = new char[1024];
                        reader.read(b);
                        writer.write(b);
                        writer.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }

    public FileCopier() {
    }

    public File getFirstFolder() {
        return firstFolder;
    }

    public void setFirstFolder(File firstFolder) {
        this.firstFolder = firstFolder;
    }

    public File getSecondFolder() {
        return secondFolder;
    }

    public void setSecondFolder(File secondFolder) {
        this.secondFolder = secondFolder;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public void setFirstFolder(String firstFolder) {
        this.firstFolder = new File(firstFolder);
    }


    public void setSecondFolder(String secondFolder) {
        this.secondFolder = new File(secondFolder);
    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(expansion);
    }
}
