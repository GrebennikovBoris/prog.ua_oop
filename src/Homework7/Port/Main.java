package Homework7.Port;

public class Main {
    public static void main(String[] args) {
        Port port = new Port(2);
        port.add(new Ship("BlackPearl",10));
        port.add(new Ship("GreenDuck",10));
        port.add(new Ship("BlueCat",10));
//        port.add(new Ship("WhiteDeath",10));
//        port.add(new Ship("Titanic",10));
//        port.add(new Ship("Alabama",10));
//        port.add(new Ship("Solar",10));
//        port.add(new Ship("Bastion",10));
//        port.add(new Ship("Shrimp",10));
        port.unload();
    }
}
