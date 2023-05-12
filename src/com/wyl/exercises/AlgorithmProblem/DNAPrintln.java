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
public class DNAPrintln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = scanner.nextInt();  //输入组别
        int[][] t = new int[group][2];   //对每组通过二维数组分类（可以不用这么麻烦，但这样最完美符合输入输出）
        for (int g=0;g<group;g++) {
            t[g][0] = scanner.nextInt();  //录入t[g][0]为行数
            t[g][1] = scanner.nextInt();  //录入t[g][1]为重复度
        }
        for (int g = 0;g<group;g++) {
            char[][] a = new char[t[g][0]][t[g][0]];  //定义大小为总行数x总行数的二维数组
            for (int m = 0; m < t[g][0]; m++) {
                for (int n = 0; n < t[g][0]; n++) {
                    if (m == n || m == t[g][0] - n - 1)
                        a[m][n] = 'X';   //当行m等于列n，或行数等于总行数a-当前列数-1时，录入X
                    else if(m>n || m<t[g][0]-n-1)
                        a[m][n] = ' ';  //在第一个X之前与每行两个X之间输入空格
                    else
                        a[m][n] = 'e';  //第二个X之后，录入e
                }
            }
            for (int i = 0; i < t[g][1]; i++) { //输出DNA
                if (i == 0) { //第一遍时，需要输出DNA的第一行
                    for (int m = 0; m < t[g][0]; m++) {
                        for (int n = 0; n < t[g][0]; n++)
                            if(a[m][n]!='e')   //把二维数组内为e的都排除不输出，就得到我们想要的答案了
                                System.out.print(a[m][n]);
                        System.out.println();
                    }
                } else {    //到了第二遍重复，不能输入DNA第一行，故从第二行开始，其他不变
                    for (int m = 1; m < t[g][0]; m++) {
                        for (int n = 0; n < t[g][0]; n++)
                            if(a[m][n]!='e')
                                System.out.print(a[m][n]);
                        System.out.println();  //换行
                    }
                }
            }
            System.out.println();
        }
    }
}
