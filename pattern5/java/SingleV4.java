package pattern5.java;

public class SingleV4 {
    private volatile static SingleV4 instance;

    private SingleV4() {
    }

    public static SingleV4 getInstance() {
        if (instance == null) {
            synchronized (SingleV4.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    instance = new SingleV4();
                }
            }
        }
        return instance;
    }

    public void showMe() {
        System.out.print("This is a single pattern test");
    }
}
