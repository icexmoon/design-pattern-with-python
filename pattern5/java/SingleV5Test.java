package pattern5.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SingleV5Test implements Callable<SingleV5> {
    public static void main(String[] args) {
        FutureTask<SingleV5>  t1 = SingleV5Test.startNewThread();
        FutureTask<SingleV5>  t2 = SingleV5Test.startNewThread();
        SingleV5 s1 = null;
        SingleV5 s2 = null;
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

    public static FutureTask<SingleV5> startNewThread(){
        SingleV5Test test = new SingleV5Test();
        FutureTask<SingleV5> task = new FutureTask<>(test);
        Thread thread = new Thread(task);
        thread.start();
        return task;
    }


    public SingleV5Test() {
    }

    @Override
    public SingleV5 call() throws Exception {
        // TODO Auto-generated method stub
        return SingleV5.getInstance();
    }
}
