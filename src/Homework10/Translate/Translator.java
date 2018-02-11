package Homework10.Translate;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Translator {
    private Path in;
    private Path out;
    private Map<String, String> map;
    private Dictionary dictionary;

    public Translator(String in, String out) {
        this.in = Paths.get(in);
        this.out = Paths.get(out);
        if (!Files.exists(this.out)) {
            this.out = Paths.get("src/Homework10//Translate/Ukrainian.out");
        }
        dictionary = new Dictionary();
        map = dictionary.getMap();

    }

    public void translate() {
        try (BufferedReader reader = new BufferedReader(new FileReader(in.toFile()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(out.toFile()))) {
            while (reader.ready()) {
                String[] s = reader.readLine().split(" ");
                for (String s1 : s) {
                    if (map.containsKey(s1)) {
                        writer.write(map.get(s1));
                        writer.append(" ");
                    } else if (s1.equals(".")) {
                        writer.write(".");
                        writer.append(" ");
                    } else if (s1.equals(",")) {
                        writer.write(",");
                        writer.append(" ");
                    }
                }
                writer.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

