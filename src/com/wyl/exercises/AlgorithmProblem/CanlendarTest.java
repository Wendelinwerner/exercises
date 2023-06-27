package com.wyl.exercises.AlgorithmProblem;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CanlendarTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int mouth = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek week = date.getDayOfWeek();
        int value = week.getValue();
        System.out.println("Mon  Tue  Wed  Thu  Fri  Sat  Sun");
        for (int i = 1; i < value;i++)
            System.out.print("         ");
        while (date.getMonthValue() == mouth){
            System.out.printf("%3d ",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print("  ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }

}
