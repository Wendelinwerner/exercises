package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 题目描述
 * 平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
 * 输入格式
 * 输入仅包含两行，每行描述一个矩形。
 *
 * 在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
 * 输出格式
 * 输出仅包含一个实数，为交的面积，保留到小数后两位。
 * 样例输入
 * 1 1 3 3
 * 2 2 4 4
 * 样例输出
 * 1.00
 *
 * @author Ryanlin
 */
public class 矩形面积相交 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] x = new double[4];
        double[] y = new double[4];
        double[] s = new double[4];
        for (int i = 0; i < 4 ;i++)  {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
//        Math.min(Math.max(x[0],x[1]));
    }
}
