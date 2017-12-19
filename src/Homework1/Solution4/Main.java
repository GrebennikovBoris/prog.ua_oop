package Homework1.Solution4;

public class Main {
    public static void main(String[] args) {
        MobileNetwork network = new MobileNetwork();
        network.registryNumber("0565771123");
        network.registryNumber("0354454656");
        network.registryNumber("0231547545");
        Phone phone = new Phone("0132345134","Samsung");
        phone.registry(network);
        phone.call("0565771123");
        phone.call("0354454656");
        phone.call("0231547545");
        phone.call("0654132546");
    }
}
