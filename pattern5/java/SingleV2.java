package pattern5.java;
public class SingleV2 {
    private static SingleV2 instance;

    private SingleV2() {
    }
    
    public static SingleV2 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            instance = new SingleV2();
        }
        return instance;
    }

    public void showMe() {
        System.out.print("This is a single pattern test");
    }
}
