package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.inheritance;

public class Manager extends Employee {
    private double bonus;

    /**
     *
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param mouth the hire mouth
     * @param day the hire day
     */
    public Manager(String name, double salary, int year, int mouth, int day) {
        super(name, salary, year, mouth, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
