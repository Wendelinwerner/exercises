package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 题目描述
 * 写一函数，输入一个四位数字，要求输出这四个数字字符，但每两个数字间空格。如输入1990，应输出"1 9 9 0"。
 * 输入格式
 * 一个四位数
 * 输出格式
 * 增加空格输出
 * 样例输入
 * 1990
 * 样例输出
 * 1 9 9 0
 *
 * @author Ryanlin
 */
public class 自定义函数之数字分离 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] nums = new int[4];
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp;
            temp = num % 10;
            nums[i] = temp;
            num /= 10;
        }
        for (int i = 0 ; i < nums.length;i++){
            System.out.print(nums[i] +" ");
        }
    }
}
