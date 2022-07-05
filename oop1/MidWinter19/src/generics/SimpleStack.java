package generics;

public class SimpleStack<T> {
    private Object[] items;
    private int itemsCount;

    public SimpleStack(int capacity) {
        items = new Object[capacity];
        itemsCount = 0;
    }

    public void push(T item) {
        items[itemsCount] = item;
        itemsCount++;
    }

    public T pop() {
        Object item = items[itemsCount - 1];
        itemsCount--;
        return (T)item;
    }
}
