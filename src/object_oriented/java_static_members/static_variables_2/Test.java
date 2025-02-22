package object_oriented.java_static_members.static_variables_2;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("\n//////////////////////////// Display Counters ////////////////////////////\n");

        c1.displayCounter();
        c2.displayCounter();

        Counter.restCounter();

        c3.displayCounter();

        Counter.restCounter();

        Counter c4 = new Counter();
        c4.displayCounter();

        System.out.println("Final count : " + Counter.getCount());
    }
}
