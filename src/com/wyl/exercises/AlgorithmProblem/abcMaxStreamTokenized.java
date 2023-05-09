package com.wyl.exercises.AlgorithmProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class abcMaxStreamTokenized {
    public static void main(String[] args) throws IOException {
        int[] a = new int[3];
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            for (int i = 0; i < 3; i++) {
                a[i] = (int) st.nval;
//                a[0] = Math.max(a[0],a[i]);
                a[0] = a[0] > a[i] ? a[0] : a[i];
            }
            System.out.println(a[0]);
        }
    }
}
