package Homework8.BlackList;

import java.util.HashSet;
import java.util.Set;

public class BlackList {
    private Set<Class> classes;

    public BlackList() {
        classes = new HashSet<>();
    }

    public void add(Class c) {
        if (c != null) {
            classes.add(c);
        }
    }


    public boolean isBanned(Object o) {
        return classes.contains(o.getClass());
    }
}
