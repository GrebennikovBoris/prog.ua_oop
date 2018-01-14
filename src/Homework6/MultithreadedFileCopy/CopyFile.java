package Homework6.MultithreadedFileCopy;

import java.io.IOException;
import java.nio.file.*;

public class CopyFile {
    private Path mainDirectory;
    private Path otherDirectory;

    public CopyFile(String from, String to) {
        this.mainDirectory = Paths.get(from);
        otherDirectory = Paths.get(to);
        copyFiles();
    }

    private void copyFiles() {
        if (Files.isDirectory(mainDirectory)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(mainDirectory)) {
                for (Path p : stream) {
                    if (!Files.isDirectory(p)) {
                        Thread thread = new Thread(new FilesWorker(p, otherDirectory));
                        thread.start();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Your mainDirectory wrong !");
        }
    }

    private class FilesWorker implements Runnable {
        private Path path;
        private Path directory;
        private Path workPath;
        private String pathName;

        FilesWorker(Path p, Path otherDirectory) {
            path = p;
            directory = otherDirectory;
            pathName = directory.getParent() + "\\" + directory.getFileName() + "\\" + path.getFileName();
        }

        @Override
        public void run() {
            try {
                if (Files.exists(Paths.get(pathName))) {
                    Files.delete(Paths.get(pathName));
                }
                workPath = Files.createFile(Paths.get(pathName));
                Files.copy(path, workPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
