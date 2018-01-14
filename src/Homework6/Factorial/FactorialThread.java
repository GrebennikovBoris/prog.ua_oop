package Homework6.Factorial;

import java.math.BigDecimal;

public class FactorialThread extends Thread {

    @Override
    public void run() {
        int number = Integer.parseInt(getName().replaceAll("[a-zA-Z]", "").replaceAll("-", ""));
        System.out.println("Факториал нити " + getName() + " " + factorial(number));
    }

    public BigDecimal factorial(int number) {
        if (number == 0) return new BigDecimal(1);
        return new BigDecimal(number).multiply(factorial(number - 1));
    }
}
