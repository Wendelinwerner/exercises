package com.wyl.exercises.FIRSTduoxiancheng;

import java.util.concurrent.TimeUnit;

public class SynchronizedTest4 {
        synchronized void m()   {

            System.out.println("m start");

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e)  {
                e.printStackTrace();
            }

            System.out.println("m end");

        }

    public static void main(String[] args) {
            new TT().m();
    }

}
class TT extends SynchronizedTest4 {

    synchronized void m() {

        System.out.println("child m start");
        super.m();
        System.out.println("child m end");

    }

}