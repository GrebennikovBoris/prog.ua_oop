package Solution4;

public class Phone {
    private MobileNetwork network;
    private String phoneNumber;
    private String model;

    public Phone(String phoneNumber, String model) {
        this.phoneNumber = phoneNumber;
        this.model = model;
    }

    public boolean registry(MobileNetwork network) {
        this.network = network;
        return network.registryNumber(phoneNumber);
    }

    public boolean call(String number) {
        if (network != null && network.isRegistry(number)) {
            System.out.println("Calling to " + number);
            return true;
        }
        System.out.println("Wrong unregister number");
        return false;
    }
}
