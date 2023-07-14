package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.equals;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year,int mouth ,int day){
        this.name = name;
        this.salary =salary;
        this.hireDay = LocalDate.of(year,mouth,day);
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

    public void raiseSalary(double byPercent){
        double raise = salary + byPercent / 100;
        salary += raise;
    }

    public boolean equals(Object otherObject){
        //a quick test to see if the objects are identical
        if (this == otherObject) return true;
        //must return false if the explicit parameter is null
        if (otherObject == null) return false;
        //if the class don't match,they can't be equal
        if (getClass() != otherObject.getClass()) return false;
        //now we know otherObject is a non-null Employee
        var other = (Employee)otherObject;
        //test whether the fields have identical values
        return Objects.equals(name,other.name)
                && salary == other.salary && Objects.equals(hireDay,other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }

    @Override
    public String toString() {
        return getName().toString() +
                "[name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                ']';
    }
}
