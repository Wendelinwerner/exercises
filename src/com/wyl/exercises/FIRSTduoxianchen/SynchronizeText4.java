package com.wyl.exercises.FIRSTduoxianchen;

import java.util.concurrent.TimeUnit;

public class SynchronizeText4 {
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
class TT extends SynchronizeText4   {

    synchronized void m() {

        System.out.println("child m start");
        super.m();
        System.out.println("child m end");

    }

}