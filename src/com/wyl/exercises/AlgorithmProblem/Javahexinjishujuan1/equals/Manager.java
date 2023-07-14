package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.equals;

import java.util.Objects;

public class Manager extends Employee {
    private double bouns;
    public Manager(String name, double salary, int year, int mouth, int day) {
        super(name, salary, year, mouth, day);
        bouns = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "bouns=" + bouns +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        //super.equals checked that this and other belong to the same class
        return Double.compare(manager.bouns, bouns) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bouns);
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bouns;
    }
}
