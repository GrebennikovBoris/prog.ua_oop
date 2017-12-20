package Homework1.Solution1;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Cat murza = new Cat();
        barsik.setAge(8);
        barsik.setName("Barsik");
        barsik.setColor("White");
        barsik.setWeight(7.2);
        barsik.setHungry(true);
        murza.setName("Murza");
        murza.setColor("White");
        murza.setWeight(3.2);
        murza.setHungry(false);
        barsik.state();
        murza.state();
        System.out.println(barsik.toString());
        System.out.println(murza.toString());
    }
}
