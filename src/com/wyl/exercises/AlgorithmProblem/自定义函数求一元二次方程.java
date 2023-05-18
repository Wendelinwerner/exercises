package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 题目描述
 * 求方程 的根，用三个函数分别求当b^2-4ac大于0、等于0、和小于0时的根，并输出结果。从主函数输入a、b、c的值。
 * 输入格式
 * a b c
 * 输出格式
 * x1=? x2=?
 * 样例输入
 * 4 1 1
 * 样例输出
 * x1=-0.125+0.484i x2=-0.125-0.484i
 *
 * @author Ryanlin
 */
public class 自定义函数求一元二次方程 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double tp = b * b - 4 * a * c;
        double x1,x2;
//        for (int i = 0 ; i < 3 ; i++)   {
            if (tp > 0)   {
                x1 = (- b + Math.sqrt(tp)) / (2 * a);
                x2 = (- b - Math.sqrt(tp)) / (2 * a);
            } else if (tp == 0) {
                x1 = x2 = -b / (2 * a);
            } else {
                double x11 = - b / (2 * a);
                double x12 = Math.sqrt(- tp) / (2 * a);
                System.out.print("x1 = " + String.format("%.3f",x11) + "+" + String.format("%.3fi",x12));
                System.out.print(" x2 = " + String.format("%.3f",x11) + "-" + String.format("%.3fi",x12));
                return;
            }
            System.out.println("x1 = " + String.format("%.3f",x1) + " x2 = " + String.format("%.3f",x2));
//        }
    }


}
