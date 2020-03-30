package atomic;

import domain.Student;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.function.IntUnaryOperator;

/**
 * int数组原子操作
 */
public class AtomicIntegerArrayDemo {
    public static void main(String[] args) {
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(15);
        /**
         * 设置给定下标的值  先设置值之后再返回设置好的值
         */
        int i3 = atomicIntegerArray.accumulateAndGet(0, 123, (x, y) -> {
            return x + y;
        });
        System.out.println("accumulateAndGet:" + i3);

        /**
         * 把改下标的值与传入的值相加，存入，进行返回
         */
        int i4 = atomicIntegerArray.addAndGet(0, 666);
        System.out.println("addAndGet:" + i4);

        /**
         * 把该下标的值与原是值进行比较，相同更改成，设置值，并返回
         */
        boolean b = atomicIntegerArray.compareAndSet(0, atomicIntegerArray.get(0), 777);
        System.out.println("compareAndSet:" + b);

        /**
         * 自减1 在返回
         */
        int i = atomicIntegerArray.decrementAndGet(0);
        System.out.println("decrementAndGet:" + i);

        /**
         *  先返回原始值，在进行计算，设置值
         */
        int andAccumulate = atomicIntegerArray.getAndAccumulate(0, 123, (x, y) -> {
            return x + y;
        });
        System.out.println("getAndAccumulate:" + andAccumulate);

        /**
         * 把传入的值与原始值相加，设置， 再返回
         */
        int addAndGet = atomicIntegerArray.addAndGet(0, 888);
        System.out.println("addAndGet: " + addAndGet);

        /**
         * 先返回再自减1
         */
        int andDecrement = atomicIntegerArray.getAndDecrement(0);
        System.out.println("andDecrement: " + addAndGet);

        /**
         * 先返回再自加1
         */
        int andIncrement = atomicIntegerArray.getAndIncrement(1);
        System.out.println("andIncrement: " + andIncrement);

        /**
         * 先返回 再把原始值替换成入参
         */
        int andSet = atomicIntegerArray.getAndSet(0, 1000);
        System.out.println("andSet: " + andSet);

        /**
         * 先返回 再把原始值替换成入参
         */
        int andUpdate = atomicIntegerArray.getAndUpdate(1, x -> {
            if (x > 0) {
                x = x * 5;
            } else {
                x = 6;
            }
            return x;
        });
        System.out.println("getAndUpdate: " + andUpdate);

        /**
         * 先自加1 再返回
         */
        int i1 = atomicIntegerArray.incrementAndGet(0);
        System.out.println("incrementAndGet: " + i1);

        /**
         * 把原始值替换成入参  再先返回
         */
        int i2 = atomicIntegerArray.updateAndGet(1, x -> {
            if (x > 0) {
                x = x * 5;
            } else {
                x = 6;
            }
            return x;
        });
        System.out.println("updateAndGet: " + i2);
    }
}
