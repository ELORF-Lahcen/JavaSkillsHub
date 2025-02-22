package object_oriented.java_static_members.static_variables_1;

public class Test {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println("\n//////////////////////////// Display Counters ////////////////////////////\n");

        counter1.displayCounter();
        counter2.displayCounter();
        counter3.displayCounter();

        System.out.println("Final count : " + Counter.getCount());
    }
}
