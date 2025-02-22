package object_oriented.java_static_members.static_variables_5;

public class Counter {
    private static int totalCount = 0;
    private static final int MAX_COUNT = 3;
    private int counterID;

    public Counter() {
        if (totalCount < MAX_COUNT) {
            totalCount++;
            this.counterID = totalCount;
            System.out.println("Counter created with ID : " + counterID);
        } else {
            System.out.println("Limit reached! Cannot create more than " + MAX_COUNT + " counters.");
        }
    }

    public static void showTotalCounters() {
        System.out.println("Total counters created : "+totalCount);
    }
}
