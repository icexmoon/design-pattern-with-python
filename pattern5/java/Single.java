package pattern5.java;

public class Single {
    private static Single instance;

    private Single() {
    }

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }

    public void showMe() {
        System.out.print("This is a single pattern test");
    }
}
