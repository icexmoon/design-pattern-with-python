package pattern5.java;

public class SingleV5 {
    private static SingleV5 instance = new SingleV5();

    private SingleV5() {
    }

    public static SingleV5 getInstance() {
        return instance;
    }

    public void showMe() {
        System.out.print("This is a single pattern test");
    }
}
