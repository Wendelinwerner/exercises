package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 题目描述
 * 有一个函数
 * y={  x      x<1
 *     |  2x-1   1<=x<10
 *     { 3x-11  x>=10
 * 写一段程序，输入x，输出y
 *
 * 输入格式
 * 一个数x
 *
 * 输出格式
 * 一个数y
 *
 * 样例输入
 * 14
 *
 * 样例输出
 * 31
 * @author Ryanlin
 */
public class PiecewiseFunctionCalculation02 {

    //if else / else if
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        int x = sc.nextInt();
        if (x < 1)   {
            y = x;
        }   else  {
            if (1 <= x && x < 10){
                y = 2*x - 1;
            }   else {
                y = 3*x - 11;
            }
        }
        System.out.println(y);
    }

}
