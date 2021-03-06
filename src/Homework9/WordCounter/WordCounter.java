package Homework9.WordCounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordCounter {
    private Path path;
    private Map<Character, Integer> map;

    public WordCounter(String path) {
        this.path = Paths.get(path);
        map = new HashMap<>();
    }

    public void readFile() {
        try {
            List<String> list = allLines(path);
            for (String s : list) {
                for (char c : s.toCharArray()) {
                    if (Character.isAlphabetic(c)) {
                        if (!map.containsKey(c)) {
                            map.put(c, 0);
                        } else {
                            map.replace(c, map.get(c) + 1);
                        }
                    }
                }
                sortAndSout();
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    private List<String> allLines(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    public void sortAndSout() {
        map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }

}
