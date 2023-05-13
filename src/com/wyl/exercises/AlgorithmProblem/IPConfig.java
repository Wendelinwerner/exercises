package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 * 题目描述
 * 在基于Internet的程序中，我们常常需要判断一个IP字符串的合法性。
 * 合法的IP是这样的形式：
 * A.B.C.D
 * 其中A、B、C、D均为位于[0, 255]中的整数。为了简单起见，我们规定这四个整数中不允许有前导零存在，如001这种情况。
 * 现在，请你来完成这个判断程序吧^_^
 *
 * 输入格式
 * 输入由多行组成，每行是一个字符串，输入由“End of file”结束。
 * 字符串长度最大为30，且不含空格和不可见字符
 *
 * 输出格式
 * 对于每一个输入，单独输出一行
 * 如果该字符串是合法的IP，输出Y，否则，输出N
 *
 * 样例输入
 * 1.2.3.4
 * a.b.c.d
 * 267.43.64.12
 * 12.34.56.bb
 * 210.43.64.129
 * -123.4.5.6
 * 样例输出
 * Y
 * N
 * N
 * N
 * Y
 * N
 *
 * 解题思路:用hasNext()循环做
 *
 * 注意事项:需要判断3次
 *
 * 1、是否为“End of file”
 *
 * 2、字符串中是否含有字母
 *
 * 3、数字是否大于等于0小于等于255
 *
 * @author Ryanlin
 */
public class IPConfig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A:while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("End of file")) {
                return;
            }
            //str.split("\\."):正则表达式,根据"."拆分成数组
            String[] arr = str.split("\\.");
            for (int i = 0; i < arr.length; i++) {
                //isNum:返回的是true或false
                //Boolean isNum = arr[i].matches("[0-9]+"):判断此字符串是否为数字
                //+:表示1位或多位(如"1","255"),都表示true
                //*:表示0位或多位(如"","1","255"),都表示true  注：""表示的是换行
                //?:表示0位或1位(如"","1"),都表示true
                Boolean isNum = arr[i].matches("[0-9]+");
                if (isNum) {
                    if (Integer.parseInt(arr[i]) < 0 || Integer.parseInt(arr[i]) > 255) {
                        System.out.println("N");
                        continue A;
                    }
                } else {
                    System.out.println("N");
                    continue A;
                }
            }
            System.out.println("Y");
        }
    }
}
