package Homework8.MiniDataBase;

public class Main {
    public static void main(String[] args) {
        MiniDataBase base = TestBase.init();
        base.saveBase("C:\\groups.txt");
        MiniDataBase base1 = base.loadBase("C:\\groups.txt");
        System.out.println(base1.getGroupList());

    }
}
