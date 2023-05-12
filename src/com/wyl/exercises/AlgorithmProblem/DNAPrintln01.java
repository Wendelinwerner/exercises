package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

/**
 *题目描述
 * 小强从小就喜欢生命科学，他总是好奇花草鸟兽从哪里来的。终于， 小强上中学了，接触到了神圣的名词--DNA.它有一个双螺旋的结构。这让一根筋的小强抓破头皮，“要是能画出来就好了” 小强喊道。现在就请你帮助他吧
 *
 * 输入格式
 * 输入包含多组测试数据。第一个整数N（N<=15）,N表示组数，每组数据包含两个整数a,b。a表示一个单位的DNA串的行数，a为奇数且 3<=a<=39。b表示重复度(1<=b<=20)。
 *
 * 输出格式
 * 输出DNA的形状，每组输出间有一空行。
 *
 * 样例输入
 * 2
 * 3 1
 * 5 4
 * 样例输出
 * X X
 *  X
 * X X
 *
 * X   X
 *  X X
 *   X
 *  X X
 * X   X
 *  X X
 *   X
 *  X X
 * X   X
 *  X X
 *   X
 *  X X
 * X   X
 *  X X
 *   X
 *  X X
 * X   X
 *
 * @author Ryanlin
 */
public class DNAPrintln01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        int[][] a = new int[group][2];
        for (int i = 0; i < group; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        for (int i = 0; i < group ; i++)    {
            char[][] g = new char[a[i][0]][a[i][0]];
            for (int m = 0; m < a[i][0]; m++)  {
                for (int n = 0 ; n < a[i][0]; n++)  {
                    if(m == n || m == a[i][0] - n -1)
                        g[m][n] = 'X';
                    else if (m > n || m < a[i][0] - n -1)
                        g[m][n] = ' ';
                    else
                        g[m][n] = 'e';
                }
            }
            for (int e = 0 ; e < a[i][1] ; e++ ) {
                if (e == 0) {
                    for (int m = 0; m < a[i][0]; m++) {
                        for (int n = 0; n < a[i][0]; n++)
                            if (g[m][n] != 'e')
                                System.out.print(g[m][n]);
                        System.out.println();
                    }
                }else {
                    for (int m = 1; m < a[i][0]; m++) {
                        for (int n = 0; n < a[i][0]; n++)
                            if (g[m][n] != 'e')
                                System.out.print(g[m][n]);
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }
    }
}
