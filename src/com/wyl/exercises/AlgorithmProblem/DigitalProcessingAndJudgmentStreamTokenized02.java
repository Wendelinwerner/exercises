package com.wyl.exercises.AlgorithmProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 给出一个不多于5位的整数，要求 1、求出它是几位数 2、分别输出每一位数字 3、按逆序输出各位数字，例如原数为321,应输出123
 *
 * 输入格式
 * 一个不大于5位的数字
 *
 * 输出格式
 * 三行 第一行 位数 第二行 用空格分开的每个数字，注意最后一个数字后没有空格 第三行 按逆序输出这个数
 *
 * 样例输入
 * 12345
 *
 * 样例输出
 * 5
 * 1 2 3 4 5
 * 54321
 *
 * @author Ryanlin
 */

public class DigitalProcessingAndJudgmentStreamTokenized02 {
    public static void main(String[] args) throws IOException {
        BufferedReader st = new BufferedReader(new InputStreamReader(System.in));//把字符流放到字符流缓冲区；把字节流变成字符流 System.in->字节输入流

        String line = st.readLine();//获取一行数据

        System.out.println(line.length());//获取长度

        char[] ch = line.toCharArray();//把字符串变成字符数组

        for(int a = 0; a < ch.length ; a++)   {
            if (a == ch.length -1)   {
                System.out.println(ch[a]);
            }   else {
                System.out.print(ch[a] + "\t");
            }
        }

        for (int i = ch.length -1; i >= 0 ; i--)   {
            System.out.print(ch[i] + "\t" );
        }
    }
}
