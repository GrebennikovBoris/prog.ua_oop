package Homework9.DoubleCola;

import java.util.ArrayList;
import java.util.List;

public class ColaMachine {
    private int count;
    private List<String> queue;

    public ColaMachine(int count) {
        this.count = count;
        init();
    }

    public void extradition() {
        for (int i = 0; i < count; i++) {
            String s = queue.get(0);
            queue.remove(0);
            for (int j = 0; j < 2; j++) {
                queue.add(s);
            }
        }
    }

    private void init() {
        queue = new ArrayList<>();
        queue.add("Sheldon");
        queue.add("Leonard");
        queue.add("Volovitc");
        queue.add("Kutrapalli");
        queue.add("Penni");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String s : queue) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
