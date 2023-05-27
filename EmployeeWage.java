package practiceProblems;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        Random attendance = new Random();
        int a = attendance.nextInt(2);
        if (a == 0) {
            System.out.println("employee is absent");
        } else {
            System.out.println("employee is present");

            int wagePerHour = 20;
            int fullDay = 8;
            int dailyWage = (wagePerHour * fullDay);
            System.out.println("Daily employee Wage is  " + dailyWage);
        }
    }
}