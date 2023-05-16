package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 题目描述
 * 编写一函数，由实参传来一个字符串，统计此字符串中字母、数字、空格和其它字符的个数，在主函数中输入字符串以及输出上述结果。 只要结果，别输出什么提示信息。
 * 输入格式
 * 一行字符串
 * 输出格式
 * 统计数据，4个数字，空格分开。
 * 样例输入
 * !@#$%^QWERT    1234567
 * 样例输出
 * 5 7 4 6
 *
 * @author Ryanlin
 */
public class 自定义函数之字符类型统计 {

    public static void chuli(String str) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0 ; i < str.length(); i++)    {
            if (('a' < str.charAt(i) && 'z' > str.charAt(i)) || 'A' < str.charAt(i) && 'Z' > str.charAt(i))
                a++;
            else if ('0' < str.charAt(i) && str.charAt(i) < '9')
                b++;
            else if (str.charAt(i) == ' ')
                c++;
            else
                d++;
        }
        System.out.println(a + "\t" + b + "\t"+ c + "\t" + d + "\t");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        chuli(str);
    }

}
