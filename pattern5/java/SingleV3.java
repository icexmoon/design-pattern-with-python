package pattern5.java;
public class SingleV3 {
    private static SingleV3 instance;

    private SingleV3() {
    }
    
    public static synchronized SingleV3 getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            instance = new SingleV3();
        }
        return instance;
    }

    public void showMe() {
        System.out.print("This is a single pattern test");
    }
}
