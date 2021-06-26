package pattern5.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class SingleV4Test implements Callable<SingleV4> {
    public static void main(String[] args) {
        FutureTask<SingleV4>  t1 = SingleV4Test.startNewThread();
        FutureTask<SingleV4>  t2 = SingleV4Test.startNewThread();
        SingleV4 s1 = null;
        SingleV4 s2 = null;
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

    public static FutureTask<SingleV4> startNewThread(){
        SingleV4Test test = new SingleV4Test();
        FutureTask<SingleV4> task = new FutureTask<>(test);
        Thread thread = new Thread(task);
        thread.start();
        return task;
    }


    public SingleV4Test() {
    }

    @Override
    public SingleV4 call() throws Exception {
        // TODO Auto-generated method stub
        return SingleV4.getInstance();
    }
}
