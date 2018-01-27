package Homework7.Port;

public class Ship implements Runnable {
    private String name;
    private int cargo;


    public Ship(String name, int cargo) {
        this.name = name;
        this.cargo = cargo;
    }

    public void setDock(Dock dock) {
        dock.setBusy(true);
    }

    public String getName() {
        return name;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public void run() {

    }
}
