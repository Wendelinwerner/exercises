package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.abstractClasses;

import java.time.LocalDate;

public class Employee extends Person{
    private Double salary;
    private LocalDate hireDay;
    public Employee(String name,Double salary,int year,int mouth,int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,mouth,day);
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with salary of $%.2f",salary);
    }


    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
