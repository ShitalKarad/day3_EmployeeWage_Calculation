package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAYS = 20;
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int employeeCheck = (int) Math.floor(Math.random()*10)%4;
        System.out.println(employeeCheck);
        int dailyWage = 0;
        if(employeeCheck == 1) {
            dailyWage = PART_TIME_HOUR * WAGE_PER_HOUR;
            System.out.println("Employee is part time ");
        } else if (employeeCheck == 2) {
            dailyWage =FULL_DAY_HOUR * WAGE_PER_HOUR;
            System.out.println("Employee is full time ");
        }else if (employeeCheck == 3) {
            dailyWage =FULL_DAY_HOUR * WAGE_PER_HOUR * WORKING_DAYS;
            System.out.println("Employee wage for a month is ");
        }


        else {

                System.out.println("Employee is Absent");
        }
        System.out.println("Employee daily wage is " + dailyWage);
    }
}
