package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.equals;
/**
 * This program demonstrates the equals method
 * @author Ryanlin
 */
public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("Alice",80000,1978,12,15);
        var alice3 = new Employee("Alice",80000,1978,12,15);
        var alice2 = alice1;
        var bob = new Employee("Bob",75000,1987,5,6);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));

        System.out.println("alice1 == alice3: " + (alice1 == alice3));

        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));

        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString():" + bob);

        var carl = new Manager("Carl",90000,1978,12,15);
        var boss = new Manager("Carl",90000,1978,12,15);
        boss.setBouns(5000);

        System.out.println("boss.toString(): " + boss);

        System.out.println("carl.equals(boss): " + carl.equals(boss));

        System.out.println("alice1.hashCode(): " + alice1.hashCode());

        System.out.println("alice3.hashCode(): " + alice3.hashCode());

        System.out.println("bob.hashCode(): " + bob.hashCode());

        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}
