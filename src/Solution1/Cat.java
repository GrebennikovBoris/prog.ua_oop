package Solution1;

public class Cat {
    private int age;
    private String name;
    private String color;
    private double weight;
    private boolean isHungry;

    public Cat(int age, String name, String color, double weight) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void state() {
        if (isHungry) {
            System.out.println(name + " : " + "Meooooowwwww");
        } else {
            System.out.println(name + " : " + "Zzzzzzzzzz");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public String toString() {
        return "Solution1.Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", isHungry=" + isHungry +
                '}';
    }


}
