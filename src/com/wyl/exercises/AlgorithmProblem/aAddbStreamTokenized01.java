package com.wyl.exercises.AlgorithmProblem;

import java.io.*;


/**
 * 输入两个整数a和b，计算a+b的和
 * 本题很简单，但是注意此题是多组测试数据，即需要不停的接收系统的测试输入，你都可以计算结果并输出
 *
 * 输入格式
 * 输入两个整数A和B
 * 范围不超过2^10
 * @author  Ryanlin
 */
public class aAddbStreamTokenized01 {

    public static void main(String[] args) throws IOException {

        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        int a,b;
        while (in.nextToken() != StreamTokenizer.TT_EOF)   {

            a = (int)in.nval;

            in.nextToken();

            b = (int)in.nval;

            System.out.println("a + b = " + (a+b));

        }

    }

}
