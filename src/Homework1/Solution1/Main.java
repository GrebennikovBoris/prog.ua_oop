package Homework1.Solution1;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat(8, "Barsik", "White", 7.2);
        Cat murza = new Cat(8, "Murza", "White", 3.2);
        barsik.setHungry(true);
        murza.setHungry(false);
        barsik.state();
        murza.state();
        System.out.println(barsik.toString());
        System.out.println(murza.toString());
    }
}
