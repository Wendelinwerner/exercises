package com.wyl.exercises.FIRSTduoxiancheng;

import java.util.concurrent.TimeUnit;

/**
 * 锁是不是可重入的
 */
public class STT4 {

    synchronized void m()   {
        System.out.println("m start");
        try {
            TimeUnit.SECONDS.sleep(1);
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        new TTT().m();
    }

}

class TTT extends STT4 {

    synchronized void m()   {
        System.out.println("child m start");
        super.m();
        System.out.println("child m end");

    }

}

