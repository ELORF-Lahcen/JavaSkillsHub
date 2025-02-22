package object_oriented.java_static_members.static_variables_4;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.showCounterID();
        c2.showCounterID();
        c3.showCounterID();

        System.out.println();

        Counter.showTotalCounters();
    }
}
