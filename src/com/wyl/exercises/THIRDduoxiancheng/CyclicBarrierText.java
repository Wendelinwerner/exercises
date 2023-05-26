package com.wyl.exercises.THIRDduoxiancheng;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierText {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(20,() -> System.out.println("满人，发车"));
        for (int i = 0; i < 100 ; i++) {
            new Thread(() -> {
                    try {
                        barrier.await();
                    } catch (InterruptedException | BrokenBarrierException e) {
                        e.printStackTrace();
                    }
            }).start();
        }
    }
}
