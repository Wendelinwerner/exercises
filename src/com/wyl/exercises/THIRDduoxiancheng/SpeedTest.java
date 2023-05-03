package com.wyl.exercises.THIRDduoxiancheng;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;
public class SpeedTest {
    private static final int THREAD_NUM = 10;
    private static final int COUNT_PER_THREAD = 10000000;
    private static long atomicCounter = 0L;
    private static long syncCounter = 0L;
    private static long adderCounter = 0L;
    private static AtomicLong atomic = new AtomicLong(0L);
    private static Object sync = new Object();
    private static LongAdder adder = new LongAdder();
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads1 = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            threads1[i] = new Thread(new AtomicRunnable());
        }
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < THREAD_NUM; i++) {
            threads1[i].start();
        }
        for (int i = 0; i < THREAD_NUM; i++) {
            threads1[i].join();
        }
        System.out.println("Atomic: " + atomic.get() + ", time: " + (System.currentTimeMillis() - start1) + "ms");
        Thread[] threads2 = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            threads2[i] = new Thread(new SyncRunnable());
        }
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < THREAD_NUM; i++) {
            threads2[i].start();
        }
        for (int i = 0; i < THREAD_NUM; i++) {
            threads2[i].join();
        }
        System.out.println("Synchronized: " + syncCounter + ", time: " + (System.currentTimeMillis() - start2) + "ms");
        Thread[] threads3 = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            threads3[i] = new Thread(new AdderRunnable());
        }
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < THREAD_NUM; i++) {
            threads3[i].start();
        }
        for (int i = 0; i < THREAD_NUM; i++) {
            threads3[i].join();
        }
        System.out.println("LongAdder: " + adder.sum() + ", time: " + (System.currentTimeMillis() - start3) + "ms");
    }
    public static class AtomicRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < COUNT_PER_THREAD; i++) {
                atomic.incrementAndGet();
            }
        }
    }
    public static class SyncRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < COUNT_PER_THREAD; i++) {
                synchronized (sync) {
                    syncCounter++;
                }
            }
        }
    }
    public static class AdderRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < COUNT_PER_THREAD; i++) {
                adder.increment();
            }
        }
    }
}