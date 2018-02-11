package Homework10.Translate;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> map;

    public Dictionary() {
       init();

    }

    private void init() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Вы желаете сами заполнить словарь или загрузить имеющийся ?");
            System.out.println("1 : Заполнить словарь ");
            System.out.println("2 : Использовать словарь по умолчанию ");
            System.out.println("3 : Загрузить словарь ");
            switch (Integer.parseInt(reader.readLine())) {
                case (1):
                    System.out.println("Для выхода введите 'exit'");
                    map = new HashMap<>();
                    while (true) {
                        if (reader.readLine().equals("exit")) break;
                        map.put(reader.readLine().split(" ")[0], reader.readLine().split(" ")[1]);
                    }
                    break;
                case (2):
                    fillDictionary();
                    break;

                case (3):
                    System.out.println("Введите путь к словарю");
                    map = loadDictionary(reader.readLine());
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void fillDictionary() {
        map = new HashMap<>();
        map.put("live", "живем");
        map.put("in", "в");
        map.put("In", "В");
        map.put("flat", "квартира");
        map.put("We", "Мы");
        map.put("Our", "Наша");
        map.put("isn't", "не");
        map.put("very", "очень");
        map.put("big", "большая");
        map.put("It", "Она");
        map.put("is", "есть");
        map.put("clean", "чистая");
        map.put("and", "и");
        map.put("comfortable", "комфортная");
        map.put("rooms", "комнаты");
        map.put("living-room", "гостинной");
        map.put("the", "");
        map.put("there", "");
        map.put("sofa", "диван");
        map.put("TV", "телевизор");
        map.put("bookcase", "шкаф с книгами");
        map.put("two", "два");
        map.put("armchairs", "кресла");
        map.put("my", "моей");
        map.put("room", "комнате");
        map.put("bed", "кровать");
        map.put("desk", "стол");
        map.put("shelf", "полка");
        map.put("I", "Я");
        map.put("love", "люблю");
        map.put("much", "сильно");
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void saveDictionary(String pathName) {
        if (pathName.equals("") || pathName.equals(" ")) {
            throw new IllegalArgumentException();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathName))) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> loadDictionary(String pathName) {
        if (pathName.equals("") || pathName.equals(" ")) {
            throw new IllegalArgumentException();
        }
        Map<String, String> m = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
            while (reader.ready()) {
                String[] s = reader.readLine().split("=");
                m.put(s[0], s[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return m;
    }
}
