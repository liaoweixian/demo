package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    public static void main(String[] args) {
        LockThread lockThread = new LockThread();
        LockThread lockThread1 = new LockThread();
        LockThread lockThread2 = new LockThread();
        lockThread.setName("l");
        lockThread1.setName("m");
        lockThread.start();
        lockThread1.start();
        lockThread2.start();
    }
}

class LockThread extends Thread {

    private static final ReentrantLock lock  = new ReentrantLock();
    private static final Condition condition = lock.newCondition();

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("对此锁的暂停数量：" + lock.getHoldCount());
            System.out.println("返回当前等待回去此锁的线程数量：" + lock.getQueueLength());
            //Thread.sleep(5000);
            String name = Thread.currentThread().getName();
            if (name.equals("l")) {
                condition.await(10, TimeUnit.SECONDS);
            }
            System.out.println(name);
           /* if (name.equals("l")) {
                System.out.println("--------------------");
            }*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class BoundedBuffer {
    final Lock lock = new ReentrantLock();
    final Condition notFull  = lock.newCondition();
    final Condition notEmpty = lock.newCondition();

    final Object[] items = new Object[100];
    int putptr, takeptr, count;

    public void put(Object x) throws InterruptedException {
        lock.lock();
        System.out.println("put");
        try {
            while (count == items.length)
                notFull.await();
            items[putptr] = x;
            if (++putptr == items.length) putptr = 0;
            ++count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();
        System.out.println("take");
        try {
            while (count == 0)
                notEmpty.await();
            Object x = items[takeptr];
            if (++takeptr == items.length) takeptr = 0;
            --count;
            notFull.signal();
            return x;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final BoundedBuffer bf=new BoundedBuffer();

        Thread put = new Thread(){
            public void run(){
                try {
                    while(true)
                        bf.put(new Object());
                } catch (InterruptedException e) {

                }
            }
        };
        put.start();

        Thread take= new Thread(){
            public void run(){
                try {
                    while(true)
                        bf.take();
                } catch (InterruptedException e) {

                }
            }
        };
        take.start();
    }
}