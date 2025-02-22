package object_oriented.java_static_members.static_variables_3;

public class Test {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.showActiveInstances();
        c2.showActiveInstances();
        c3.showActiveInstances();

        System.out.println();

        Counter.showTotalInstances();

        System.out.println();

        c1 = null;
        c2 = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        Counter.showTotalInstances();
    }
}
