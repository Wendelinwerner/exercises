package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.inheritance;
import java.security.PublicKey;
import java.time.*;
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int mouth, int day) {
        this.name  = name;
        this.salary =salary;
        hireDay = LocalDate.of(year,mouth,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
