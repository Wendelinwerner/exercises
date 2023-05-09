package com.wyl.exercises.AlgorithmProblem;

import java.io.*;

public class aAddbStreamTokenizer {

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
