package com.wyl.exercises.THIRDduoxiancheng;

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
 * test02
 * 使用reentrant lock可以进行“尝试锁定”tryLock，这样无法锁定，或者在指定时间内无法锁定，线程可以决定是否继续等待。
 * test03
 * 使用ReentrantLock还可以调用lockInterruptibly方法，可以对线程interrupt方法做出响应，在一个线程等待锁的过程中，可以被打断。
 * Test03
 * ReentrantLock还可以指定为公平锁
 * @author Ryanlin
 */
public class ReentrantLockTest04 extends Thread {

        private static ReentrantLock lock = new ReentrantLock(true);

        public void run() {
            for (int i = 0; i < 100 ; i++){
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "获得锁");
                } catch (Exception e) {
                    e.printStackTrace();
                }   finally {
                    lock.unlock();
                }
            }
        }

    public static void main(String[] args) {

            ReentrantLockTest04 t = new ReentrantLockTest04();

            Thread th1 = new Thread(t);
            Thread th2 = new Thread(t);

            th1.start();
            th2.start();

    }
}
