package Homework10.WordCounter;

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
            List<Character> characters = allChars(path);
            for (Character character : characters) {
                if (Character.isAlphabetic(character)) {
                    map.put(character, Collections.frequency(characters, character));
                }
            }

            sortAndSout();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    private List<Character> allChars(Path path) throws IOException {
        ArrayList<Character> characters = new ArrayList<>();
        for (String s : Files.readAllLines(path)) {
            for (char c : s.toCharArray()) {
                characters.add(c);
            }
        }
        return characters;
    }

    public void sortAndSout() {
        map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}
