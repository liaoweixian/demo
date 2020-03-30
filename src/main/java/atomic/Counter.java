package atomic;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * 原子操作
 */
public class Counter {

    private final AtomicInteger atomicInt = new AtomicInteger(0);
    private volatile int i = 0;

    public static void main(String[] args) {
        Counter counter = new Counter();
        ArrayList<Thread> list = new ArrayList<>(1000);
        long start = System.currentTimeMillis();
        IntStream.range(0, 100).forEach(u -> {
            list.add(new Thread(() -> IntStream.range(0,1000).forEach(v -> {
                counter.safeCount();
                counter.safeCount1();
            })));
        });
        //启动所有线程
        list.forEach(Thread::start);

        list.forEach( u -> {
            try {
                u.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(counter.i);
        System.out.println(counter.atomicInt.get());
        System.out.println(System.currentTimeMillis() - start);
    }

    /* 使用CAS 来实现原子操作*/
    public void safeCount() {
        for (; ; ) {
            int i = atomicInt.get();

            /* 其实，假如使用 原子类来实现计数器，不需要直接用 cas 的API，原子类已经提供了现成的API了*/
            boolean success = atomicInt.compareAndSet(i, i + 1);
            if (success) {
                break;
            }
        }
    }

    /* 使用 锁 来实现原子操作*/
    public synchronized void safeCount1() {
        i++;
    }

    /* 线程不安全的累加*/
    public void count() {
        i++;
    }

}
