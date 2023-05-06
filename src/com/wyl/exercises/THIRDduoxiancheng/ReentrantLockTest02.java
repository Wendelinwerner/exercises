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
 * test02
 * 使用reentrant lock可以进行“尝试锁定”tryLock，这样无法锁定，或者在指定时间内无法锁定，线程可以决定是否继续等待。
 * @author Ryanlin
 */

public class ReentrantLockTest02 {
    ReentrantLock lock = new ReentrantLock();

    void m1() {
        try {
            lock.lock();
            for (int i = 0 ; i < 3 ; i++){
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    /**
     * 使用trylock进行尝试锁定，不管锁定与否，方法都将继续执行
     * 可以更具trylock的返回值来判定给是否锁定
     * 也可以指定trylock的时间，由于trylock（time）抛出异常，所以要注意unlock的处理，必须要放进finally中
     */
    void m2()   {

        boolean locked = false;

        try {
            locked = lock.tryLock(5,TimeUnit.SECONDS);
            System.out.println("m2..." + locked);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   finally {
            if(locked) lock.unlock();
        }

    }

    public static void main(String[] args) {
        ReentrantLockTest02 t = new ReentrantLockTest02();

        new Thread(t::m1).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(t::m2).start();
    }
}
