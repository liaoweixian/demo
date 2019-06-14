package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/**
 * Callable 使用 能够返回参数
 */
public class CallableDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        System.out.println("进来了");
        return 1;
    }

    public static void main(String[] args) {
        CallableDemo callableDemo = new CallableDemo();
        FutureTask<Integer> callableDemoFutureTask = new FutureTask<Integer>(callableDemo);
        Thread thread = new Thread(callableDemoFutureTask);
        thread.start();
        try {
            System.out.println(callableDemoFutureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
