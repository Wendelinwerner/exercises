package com.wyl.exercises.FIRSTduoxiancheng;

public class SynchronizedTest1 implements Runnable{

    private int count = 100;
    @Override
    public  synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + "count = " + count);
    }

    public static void main(String[] args){

        SynchronizedTest1 t = new SynchronizedTest1();
        for (int i=0; i<100; i++){
            new Thread(t,"THREAD" + i).start();
        }

    }

}
