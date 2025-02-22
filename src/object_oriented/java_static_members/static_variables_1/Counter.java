package object_oriented.java_static_members.static_variables_1;

public class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Counter.count = count;
    }

    public void displayCounter() {
        System.out.println(count);
    }
}
