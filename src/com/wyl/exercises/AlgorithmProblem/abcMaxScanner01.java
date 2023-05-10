package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 编写一个程序，输入a、b、c三个值，输出其中最大值。
 *
 * 输入格式
 * 一行数组，分别为a b c
 *
 * 可用Math函数求最大值    也 可用表达式
 * @author Ryanlin
 */
public class abcMaxScanner01 {
    public static void main(String[] args) {

         int[] a = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 3 ; i++)   {
                a[i] = sc.nextInt();
                a[0] = Math.max(a[0], a[i]);
        }
        System.out.println(a[0]);

    }
}
