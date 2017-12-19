package Homework1.Solution4;

import java.util.HashSet;
import java.util.Set;

public class MobileNetwork {
    private Set<String> mobileNumbersBase;

    public MobileNetwork() {
        this.mobileNumbersBase = new HashSet<>();
    }

    public boolean isRegistry(String number) {
        for (String string : mobileNumbersBase) {
            if (string.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public boolean registryNumber(String number) {
        if (!mobileNumbersBase.contains(number)) {
            mobileNumbersBase.add(number);
            return true;
        }
        return false;
    }
}
