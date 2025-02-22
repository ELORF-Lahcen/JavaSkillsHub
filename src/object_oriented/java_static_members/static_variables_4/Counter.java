package object_oriented.java_static_members.static_variables_4;

public class Counter {
    private static int totalCount = 0;
    private int counterID;

    public Counter() {
        totalCount++;
        this.counterID = totalCount;
    }

    public void showCounterID() {
        System.out.println("Counter ID : " + counterID);
    }

    public static void showTotalCounters() {
        System.out.println("Total counters created : " + totalCount);
    }
}
