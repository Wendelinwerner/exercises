package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 *题目描述
 * 写一函数，将一个字符串中的元音字母复制到另一个字符串，然后输出。
 * 输入格式
 * 一行字符串
 * 输出格式
 * 顺序输出其中的元音字母（aeiou）
 * 样例输入
 * abcde
 * 样例输出
 * ae
 * @author Ryanlin
 */
public class 自定义函数之字符提取 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < st.length(); i++)  {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {
                stringBuffer.append(st.charAt(i));
            }
        }
        System.out.println(stringBuffer);
    }

}
