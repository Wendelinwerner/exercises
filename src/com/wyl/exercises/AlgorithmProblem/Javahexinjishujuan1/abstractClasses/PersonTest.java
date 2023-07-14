package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.abstractClasses;

/**
 * This program demonstrates abstract classes
 * @author Ryanlin
 */
public class PersonTest {
    public static void main(String[] args) {
        var people = new  Person[2];

        //fill the people array with Student and Employee objects;
        people[0] = new Employee("dasdad", 43530.0,1998,12,12);
        people[1] = new Student("dwefgggg", "math");

        for (Person p : people){
            System.out.println(p.getName() + " ," + p.getDescription());
        }
    }
}
