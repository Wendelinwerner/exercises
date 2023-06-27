package com.wyl.exercises.AlgorithmProblem;

/**
 * This program demonstrates static methods;
 * @author Ryanlin
 */
public class StaticTest {
    // fill the staff array with three Employee objects.
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Tom",40000);
        staff[1] = new Employee("Dick",60000);
        staff[2] = new Employee("Harry",65000);

        // print out information about all Employee objects
        for (Employee e : staff) {
        e.setId();
        System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
        }
        int n = Employee.getNextId();// calls static method
        System.out.println("Next available id = " + n);
    }
}

class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;
    public Employee(String n,double s) {
            name = n;
            salary = s;
            id = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public static int getNextId() {
        return nextId;// returns static filed
    }

    public void setId() {
        id = nextId;// set id to next available id
        nextId++;
    }

    public static void main(String[] args) {
        var e = new Employee("Harry",50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
