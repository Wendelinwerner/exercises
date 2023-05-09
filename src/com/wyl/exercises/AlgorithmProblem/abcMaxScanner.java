package com.wyl.exercises.AlgorithmProblem;

import java.util.Scanner;

public class abcMaxScanner {
    public static void main(String[] args) {

         int[] a = new int[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 3 ; i++)   {
                a[i] = sc.nextInt();
                a[0] = Math.max(a[0], a[i]);
        }
        System.out.println(a[0]);

    }
}
