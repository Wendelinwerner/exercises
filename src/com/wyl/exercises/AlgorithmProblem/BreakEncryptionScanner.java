package com.wyl.exercises.AlgorithmProblem;

import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

/**
 * 要将"China"译成密码，译码规律是：用原来字母后面的第4个字母代替原来的字母．
 * 例如，字母"A"后面第4个字母是"E"．"E"代替"A"。因此，"China"应译为"Glmre"。
 * 请编一程序，用赋初值的方法使cl、c2、c3、c4、c5五个变量的值分别为，
 * ’C’、’h’、’i’、’n’、’a’，经过运算，使c1、c2、c3、c4、c5分别变为’G’、’l’、’m’、’r’、’e’，并输出。
 *
 * 解题思路：
 * 字符串，输出字符+4，先转换 int类型 再转换字符（char）类型
 * @author Ryanlin
 */
public class BreakEncryptionScanner {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0 ; i < s.length() ; i++) {
            char ch = (char) ((int)s.charAt(i) + 4);//转换成acsII
//            步骤拆分
//            int n = (int)s.charAt(i);
//            char ch = (char) (n + 4);
            System.out.println(ch);
        }
    }
}
