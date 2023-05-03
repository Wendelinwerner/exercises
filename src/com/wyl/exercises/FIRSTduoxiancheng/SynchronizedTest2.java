package com.wyl.exercises.FIRSTduoxiancheng;

/**
 * 同步与非同步方法是否可以同时调用
 * 写m1延迟10000ms写m2延迟5000ms，同时调用，看是m1输出完再输出m2，还是输出m1时输出m2再结束
 * @author wyl
 */
public class SynchronizedTest2 {

    public synchronized void m1() {

        System.out.println(Thread.currentThread().getName() + "m1 start...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e)  {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m1 end");
    }

    public void m2() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "m2");
    }

    public static void main(String[] args) {
        SynchronizedTest2 text2 = new SynchronizedTest2();
//        new Thread(text2::m1,"t1").start();
//        new Thread(text2::m2,"t2").start();
        new Thread(()->text2.m1(),"t1").start();
        new Thread(()->text2.m2(),"t2").start();
    }

}
