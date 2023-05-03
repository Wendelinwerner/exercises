package com.wyl.exercises.FIRSTduoxiancheng;

import java.util.concurrent.TimeUnit;

/**
 * 面试题：模拟银行账户
 * 对业务写方法加锁
 * 对业务读方法不加锁
 * 这样行不行?
 *
 * 容易产生脏读问题
 */

public class Account1 {

    String name;
    double balence;
    synchronized void set(String name,double balence)   {
        this.name = name;
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balence = balence;
    }

    public double getBalence(String name) {
        return this.balence;
    }

    public static void main(String[] args) {
        Account1 a = new Account1();
        new Thread(()->a.set("zhangsan",1000.0)).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.getBalence("zhangsan"));

        try {
            TimeUnit.SECONDS.sleep(2);
        }   catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.getBalence("zhangsan"));

    }

}