package com.wyl.exercises.THIRDduoxiancheng;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * test
 * reentrant lock用于替代synchronized
 * 本例中由于m1锁定this，只有m1执行完毕的时候，m2才能执行
 * 这里是复习synchronized是原始的语义
 *test01
 * 使用reentrant lock可以完成同样的功能
 * 需要注意的是，必须要必须要必须要手动释放锁（重要的事情说三遍）
 * 使用syn锁定的话如果遇到异常，jvm会自动释放锁，但是lock必须手动释放锁，因此经常在finally中进行锁的释放
 * @author Ryanlin
 */
public class ReentrantLockTest01 {
        ReentrantLock lock = new ReentrantLock();

        void m1()   {
            try {
                lock.lock();
                for (int i = 0; i < 10 ; i++)   {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }   finally {
                lock.unlock();
            }
        }

        void m2()   {
            lock.lock();
            System.out.println("m2...");
            lock.unlock();
        }

    public static void main(String[] args) {
        ReentrantLockTest01 t = new ReentrantLockTest01();

        new Thread(t::m1).start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(t::m2).start();
    }
}
