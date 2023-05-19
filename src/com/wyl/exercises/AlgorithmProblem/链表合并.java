package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * 题目描述
 * 已有a、b两个链表，每个链表中的结点包括学号、成绩。要求把两个链表合并，按学号升序排列。
 *
 * 输入格式
 * 第一行，a、b两个链表元素的数量N、M,用空格隔开。 接下来N行是a的数据 然后M行是b的数据 每行数据由学号和成绩两部分组成
 *
 * 输出格式
 * 按照学号升序排列的数据
 *
 * 样例输入
 * 2 3
 * 5 100
 * 6 89
 * 3 82
 * 4 95
 * 2 10
 * 样例输出
 * 2 10
 * 3 82
 * 4 95
 * 5 100
 * 6 89
 *
 * @author Ryanlin
 */
public class 链表合并 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int sum = sc.nextInt() + sc.nextInt();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < sum; i++ ) {
            treeMap.put(sc.nextInt(),sc.nextInt());
        }
        for (Integer i:treeMap.keySet()) {
            System.out.println(i + " " + treeMap.get(i));
        }
    }

}
