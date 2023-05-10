package com.wyl.exercises.AlgorithmProblem;

import java.io.IOException;
import java.util.Scanner;

/**
 * 输入两个整数a和b，计算a+b的和
 * 本题很简单，但是注意此题是多组测试数据，即需要不停的接收系统的测试输入，你都可以计算结果并输出
 *
 * 输入格式
 * 输入两个整数A和B
 * 范围不超过2^10
 * @author  Ryanlin
 */

public class aAddbScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        while (sc.hasNext()) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a + b;
            System.out.println("a + b = " + c);
        }

    }
}
