package pattern5.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SingleV3Test implements Callable<SingleV3> {
    public static void main(String[] args) {
        FutureTask<SingleV3>  t1 = SingleV3Test.startNewThread();
        FutureTask<SingleV3>  t2 = SingleV3Test.startNewThread();
        SingleV3 s1 = null;
        SingleV3 s2 = null;
        try {
            s1 = t1.get();
            s2 = t2.get();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(s1 != null && s1 == s2){
            System.out.println("create same single instance");
        }
        else if(s1 != null && s1 != s2){
            System.out.println("create another single instance");
        }
        else{
            ;
        }
    }

    public static FutureTask<SingleV3> startNewThread(){
        SingleV3Test test = new SingleV3Test();
        FutureTask<SingleV3> task = new FutureTask<>(test);
        Thread thread = new Thread(task);
        thread.start();
        return task;
    }


    public SingleV3Test() {
    }

    @Override
    public SingleV3 call() throws Exception {
        // TODO Auto-generated method stub
        return SingleV3.getInstance();
    }
}
