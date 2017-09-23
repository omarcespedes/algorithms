package udemy.basic;

public class Counter {
    private int count;
    private String name;
    Counter(String str) {
        this.name = str;
    }

    public void increment() {
        count++;
    }

    public int getCurrentValue() {
        return count;
    }

    public String toString() {
        return name + this.count;
    }
}
