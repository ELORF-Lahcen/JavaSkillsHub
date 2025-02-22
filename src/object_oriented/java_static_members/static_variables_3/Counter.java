package object_oriented.java_static_members.static_variables_3;

public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public void showActiveInstances() {
        System.out.println("Active Instances : " + count);
    }

    @Override
    protected void finalize() throws Throwable {
        count--;
        System.out.println("An instance is destroyed. Active instances: " + count);
        super.finalize();
    }

    static void showTotalInstances() {
        System.out.println("Total active instances: "+count);
    }
}
