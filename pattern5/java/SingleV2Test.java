package pattern5.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SingleV2Test implements Callable<SingleV2> {
    public static void main(String[] args) {
        FutureTask<SingleV2>  t1 = SingleV2Test.startNewThread();
        FutureTask<SingleV2>  t2 = SingleV2Test.startNewThread();
        SingleV2 s1 = null;
        SingleV2 s2 = null;
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

    public static FutureTask<SingleV2> startNewThread(){
        SingleV2Test test = new SingleV2Test();
        FutureTask<SingleV2> task = new FutureTask<>(test);
        Thread thread = new Thread(task);
        thread.start();
        return task;
    }


    public SingleV2Test() {
    }

    @Override
    public SingleV2 call() throws Exception {
        // TODO Auto-generated method stub
        return SingleV2.getInstance();
    }
}
