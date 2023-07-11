package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1;

/**
 * This program demonstrates parameter passing in java.
 * @author Ryanlin
 */
public class ParamTest {
    public static void main(String[] args) {

        /**
         * Test1:Method can't modify numeric parameters
         */
       System.out.println("Testing tripleValue:");
       double percent = 10;
       System.out.println("Before percent:" + percent);
       tripleValue(percent);
       System.out.println("After percent" + percent);
        /**
         * Test2:Methods can change the state of object parameters
         */
        System.out.println("\nTesting tripleSalary");
        var herry = new Employee("Herry",50000);
        System.out.println("Before herry:" + herry.getSalary());
        tripleSalary(herry);
        System.out.println("After herry:" + herry.getSalary());
        /**
         * Test3:Methods can"t attach new objects to object parameters
         */
        System.out.println("\nTesting swap");
        var a = new Employee("qwert",90000);
        var b =new Employee("xcvbcvb",12304124);
        System.out.println("Before of method: a = " + a.getName());
        System.out.println("Before of method: b = " + b.getName());
        swap(a,b);
        System.out.println("After of method: a = " + a.getName());
        System.out.println("After of method: b = " + b.getName());
    }
    public static void tripleValue(double x) {//doesn't work
        x = 3 * x;
        System.out.println("End of method: x = " + x);
    }

    public static void tripleSalary(Employee x) {//work
        x.raiseSalary(200);
        System.out.println("End of method: x = " + x.getSalary());
    }

    public static void swap(Employee x,Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x = " + x.getName());
        System.out.println("End of method: y = " + y.getName());
    }

    static class Employee {// Simplified Employee class
        private String name;
        private double salary;
        public Employee(String n,double s) {
            name = n;
            salary = s;
        }
        public String getName() {
            return name;
        }
        public double getSalary() {
            return salary;
        }
        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent / 100;
            salary += raise;
        }
    }
}
