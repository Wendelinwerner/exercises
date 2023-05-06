package com.wyl.exercises.THIRDduoxiancheng;

import java.util.concurrent.TimeUnit;

/**
 * reentrant lock用于替代synchronized
 * 本例中由于m1锁定this，只有m1执行完毕的时候，m2才能执行
 * 这里是复习synchronized是原始的语义
 * @author Ryanlin
 */
public class ReentrantLockTest {

    synchronized void m1()  {
        for (int i = 0; i < 10; i++){
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            if (i == 8) m2();
        }
    }

    synchronized void m2() {
        System.out.println("m2...");
    }

    public static void main(String[] args) {
        ReentrantLockTest t = new ReentrantLockTest();

        new Thread(t::m1).start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(t::m2).start();
    }

}
