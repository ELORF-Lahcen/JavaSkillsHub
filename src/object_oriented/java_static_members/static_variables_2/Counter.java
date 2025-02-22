package object_oriented.java_static_members.static_variables_2;

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

    static public void restCounter() {
        count = 0;
        System.out.println("Counter has been reset.");
    }

    public void displayCounter() {
        System.out.println("Counter is : "+count);
    }
}
