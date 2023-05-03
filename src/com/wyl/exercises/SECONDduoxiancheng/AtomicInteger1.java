package com.wyl.exercises.SECONDduoxiancheng;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInteger1 {
    AtomicInteger count = new AtomicInteger(0);

    void m() {
        for (int i = 0; i < 10000; i++) {
            count.incrementAndGet();
//            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        AtomicInteger1 t  = new AtomicInteger1();

        List<Thread> threads = new ArrayList<>();

        for(int i = 0;i < 10;i++){
            threads.add(new Thread(t::m,"thread-" + i));
//            System.out.println(i);
        }

        threads.forEach((o) -> o.start());

        threads.forEach((o -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        })
        );
        System.out.println(t.count);
    }
}
