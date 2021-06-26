package pattern5.java;

public class SingleTest {
    public static void main(String[] args) {
        // Single single = new Single();
        // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        // The constructor Single() is not visible

        // at pattern5.java.SingleTest.main(SingleTest.java:5)    
        Single single = Single.getInstance();
        single.showMe();
        // This is a single pattern test
    }
}
