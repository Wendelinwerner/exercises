package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 题目描述
 * 正整数的各位数字之和被Tom称为Tom数。求输入数（<2^32）的Tom数!
 *
 * 输入格式
 * 每行一个整数(<2^32).
 *
 * 输出格式
 * 每行一个输出,对应该数的各位数之和.
 *
 * 样例输入
 * 12345
 * 56123
 * 82
 * 样例输出
 * 15
 * 17
 * 10
 *
 * @author Ryanlin
 */
public class TomMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())    {
            String num = sc.next();
            char[] t = num.toCharArray();
            int sum = 0;
            for (int i = 0 ; i < t.length; i++) {
                sum += Integer.parseInt(t[i] + "");
            }
            System.out.println(sum);
        }
    }

}
