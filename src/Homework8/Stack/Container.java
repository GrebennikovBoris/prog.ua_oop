package Homework8.Stack;

import Homework8.BlackList.BlackList;

public class Container {
    private Object[] objects;
    private int head;
    private BlackList list;

    public Container() {
        objects = new Object[10];
    }

    public void push(Object o) {
        if (o == null) {
            return;
        }
        if (head == objects.length) {
            Object[] array = new Object[objects.length + 10];
            System.arraycopy(objects, 0, array, 0, head);
            objects = array;
        }
        if (list != null && !list.isBanned(o)) {
            objects[head++] = o;
        }

    }

    public Object pool() {
        if (head < 1) {
            throw new IndexOutOfBoundsException();
        }
        return objects[--head];
    }

    public void setList(BlackList list) {
        this.list = list;
    }

    public Object peek() {
        if (head < 1) {
            throw new IndexOutOfBoundsException();
        }
        return objects[head - 1];
    }
}
