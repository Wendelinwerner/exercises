package com.wyl.exercises.AlgorithmProblem;

import java.io.IOException;
import java.util.Scanner;

public class aAddbScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        while (sc.hasNext()) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a + b;
            System.out.println("a + b = " + c);
        }

    }
}
