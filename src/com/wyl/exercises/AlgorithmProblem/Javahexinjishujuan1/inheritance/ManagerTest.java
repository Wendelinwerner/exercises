package com.wyl.exercises.AlgorithmProblem.Javahexinjishujuan1.inheritance;

/**
 * This Program demonstrates inheritance
 * @author Ryanlin
 */
public class ManagerTest {
    public static void main(String[] args) {
        //construct a Manager object
        var boss = new Manager("Carl Manager",90000,1999,12,23);
        boss.setBonus(5000);

        var staff = new Employee[3];

//        fill the staff array with Manager and Employee objects

        staff[0] = boss;
        staff[1] = new Employee("aa",50000,1890,4,18);
        staff[2] = new Employee("aaqwe",59000,1998,8,18);

//        print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + " ,salary = " + e.getSalary());
        }
    }
}
