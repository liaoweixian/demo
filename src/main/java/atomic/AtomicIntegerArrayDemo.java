package atomic;

import domain.Student;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicIntegerArrayDemo {
    public static void main(String[] args) {
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(new int[15]);
        System.out.println(atomicIntegerArray);
        int i = atomicIntegerArray.addAndGet(0, 10);
        System.out.println(i);
        System.out.println(atomicIntegerArray);
    }
}
