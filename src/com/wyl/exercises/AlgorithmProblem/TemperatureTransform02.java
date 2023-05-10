package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 题目描述
 * 输入一个华氏温度，要求输出摄氏温度。公式为 c=5(F-32)/9，取位2小数。
 **
 * 输入格式
 * 一个华氏温度，浮点数
 *
 * 输出格式
 * 摄氏温度，浮点两位小数
 *
 * @author Ryanlin
 */
public class TemperatureTransform02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float F = sc.nextFloat();
        float c = 5*(F - 32) / 9;
        System.out.print("c = ");
        System.out.printf("%.2f",c);
    }
}
