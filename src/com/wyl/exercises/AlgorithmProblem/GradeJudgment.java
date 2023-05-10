package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 *题目描述
 * 给出一百分制成绩，要求输出成绩等级‘A’、‘B’、‘C’、‘D’、‘E’。 90分以及90分以上为A，80-89分为B，70-79分为C，60-69分为D，60分以下为E。
 *
 *  输入格式
 * 一个整数0－100以内
 *
 * 输出格式
 * 一个字符，表示成绩等级
 *
 * 样例输入
 * 90
 *
 * 样例输出
 * A
 *
 * @author Ryanlin
 */
public class GradeJudgment {

    //if else
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cj = sc.nextInt();
        if(cj <= 100 && cj >= 0) {
            if (cj >= 90) {
                System.out.println("成绩等级为A");
            } else if (cj < 90 && cj >= 80) {
                System.out.println("成绩等级为B");
            } else if (cj < 80 && cj >= 70) {
                System.out.println("成绩等级为C");
            } else if (cj < 70 && cj >= 60) {
                System.out.println("成绩等级为D");
            } else {
                System.out.println("成绩等级为E");
            }
        }   else {
            System.out.println("数据输入错误");
        }

    }

}
