package com.wyl.exercises.THIRDduoxiancheng;

import java.util.concurrent.CountDownLatch;

/**
 * 可以使一个或多个线程等待其他线程各自执行完毕后再执行
 *
 * @author Ryanlin
 */
public class CountdownLatchText {
    public static void main(String[] args) {
        usingJoin();
        usingCountdownLatch();
    }
    public static void usingCountdownLatch() {
        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                int result = 0;
                for (int j = 0; j <10000 ;j++) result += j;
                latch.countDown();
            });
        }

        for (int i = 0 ;i < threads.length;i++) {
            threads[i].start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("latch end");
    }

    private static void usingJoin() {
        Thread[] threads = new Thread[100];

        for (int i = 0; i < threads.length ; i++) {
            threads[i] = new Thread(() -> {
                int result = 0;
                for (int j = 0; j < threads.length;j++) result += j;
            });
        }

        for (int i = 0; i <threads.length ; i++) {
            threads[i].start();
        }

        for (int i = 0;i < threads.length;i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("join end");
    }
}
