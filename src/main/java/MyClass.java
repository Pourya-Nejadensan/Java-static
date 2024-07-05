public class MyClass {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementTotalCount(){
        totalCount++;
    }

    public void incrementInstanceCount(){
        instanceCount++;
    }

    @Override
    public String toString() {
        return "MyClass{ " +
                "instanceCount= " + instanceCount + "  " +
                "totalCount= " + totalCount + "  " +
                '}';
    }
}
