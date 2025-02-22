package object_oriented.java_static_members.static_variables_5;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        System.out.println();

        Counter.showTotalCounters();
    }
}
