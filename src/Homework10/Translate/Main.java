package Homework10.Translate;

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator("src/Homework10/Translate/English.in", "src/Homework10/Translate/Ukrainian.out");
        translator.translate();

    }
}
