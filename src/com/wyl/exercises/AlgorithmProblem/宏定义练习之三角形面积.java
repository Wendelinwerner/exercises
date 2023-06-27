package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * 题目描述
 * 三角形面积=SQRT(S*(S-a)*(S-b)*(S-c)) 其中S=(a+b+c)/2，a、b、c为三角形的三边。 定义两个带参的宏，一个用来求area， 另一个宏用来求S。 写程序，在程序中用带实参的宏名来求面积area。
 * 输入格式
 * a b c三角形的三条边,可以是小数。
 * 输出格式
 * 三角形面积，保留3位小数
 * 样例输入
 * 3 4 5
 * 样例输出
 * 6.000
 *
 * @author Ryanlin
 */
public class 宏定义练习之三角形面积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double result = getArea(a,c,b);
        System.out.printf("%.3f",result);
    }

    public static double getPerimeter(double a,double b,double c) {
        return (a + b + c) / 2;
    }

    public static double getArea(double a,double b, double c)   {
        double result = getPerimeter(a,b,c);
        return sqrt(result * (result - a) * (result - b) * (result - c));
    }
}
