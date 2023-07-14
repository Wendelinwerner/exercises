package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.abstractClasses;

public class Student extends Person {
    private String major;

    /**
     * @param name the student's name
     * @param major the student's major
     */
    public Student(String name, String major) {
        // pass name to superclass constructor
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student major in " + major;
    }
}
