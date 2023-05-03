package com.wyl.exercises.FIRSTduoxiancheng;

import java.util.concurrent.TimeUnit;

/**
 * 同步与非同步方法是否可以同时调用
 * 写m1延迟10000ms写m2延迟5000ms，同时调用，看是m1输出完再输出m2，还是输出m1时输出m2再结束
 * @author wyl
 */

public class SynchronizedTest22 {

    synchronized void m1()  {

        System.out.println("m1 start");

        try {
            TimeUnit.SECONDS.sleep(2);
        }   catch (InterruptedException e)  {
            e.printStackTrace();
        }

        System.out.println("m1 end");

    }

    public void m2()  {

        try {
            TimeUnit.SECONDS.sleep(1);
        }   catch (InterruptedException e)  {
            e.printStackTrace();
        }

        System.out.println("m2");


    }

    public static void main(String[] args) {
            SynchronizedTest22 t = new SynchronizedTest22();
//            new Thread(t::m1,"t1").start();
//            new Thread(t::m2,"t2").start();
                new Thread(()->t.m1()).start();
                new Thread(()->t.m2()).start();
    }

}