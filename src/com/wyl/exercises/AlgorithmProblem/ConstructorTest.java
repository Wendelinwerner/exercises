package com.wyl.exercises.AlgorithmProblem;

import java.util.Random;

/**
 * This program demonstrate object construction
 * @author Ryanlin
 */
public class ConstructorTest {

    public static void main(String[] args) {
        //fill the staff array with three Employee objects
        var staff = new  Employee[3];

        staff[0] = new Employee("Herry",40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        //print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name = " + e.getName() + " id = " + e.getId() + " salary = " + e.getSalary());
    }

    static class Employee {
        private static int nextId;
        private int id;
        private String name = "";// instance filed initialization
        private double salary;

        static {
            //static initialization block
            var generator = new Random();
            //set nextId to a random number between 0 and 9999
            nextId = generator.nextInt(10000);
        }

        //object initialization block
        {
            id = nextId;
            nextId++;
        }

        //three overloaded constructors
        public Employee(String n,double s) {
            name = n;
            salary = s;
        }

        public Employee(double s) {
            //calls the Employee(String,double) constructor
            this("Employee #  " + nextId, s);
        }

        //the default constructor
        public Employee() {
            //name initialized to  " " --see above
            //salary not explicitly set --initialized to 0
            //id initialized in initialization block
        }

        public double getSalary() {
            return salary;
        }

        public static int getNextId() {
            return nextId;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

}
