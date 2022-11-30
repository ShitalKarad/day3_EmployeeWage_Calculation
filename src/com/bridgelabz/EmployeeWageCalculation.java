package com.bridgelabz;

public class EmployeeWageCalculation {


    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        refactor();

    }
    public static void refactor(){

         int wagePerHour = 25;
         int fullDayHour = 8;
         int partTimeHour = 4;
         int isFullTime = 2;
         int isPartTime = 1;
         int workingHoursPerMonth = 110;
         int workingDaysPerMonth = 22;



         int totalWage = 0;

         int dayCount = 1;
         int workingHours = 0;
         while (dayCount <workingDaysPerMonth && workingHours < workingHoursPerMonth ) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeCheck);
            int dailyWage = 0;
            switch (employeeCheck) {
                case 1:
                    dailyWage = partTimeHour * wagePerHour;
                    workingHours += partTimeHour;
                    System.out.println("Employee is part time " +dailyWage);
                    break;
                case 2:
                    dailyWage = fullDayHour * wagePerHour;
                    workingHours +=fullDayHour;
                    System.out.println("Employee is full time " +dailyWage);
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }
            dayCount++;
            totalWage = totalWage +dailyWage;
        }
        System.out.println("Total hours "+ workingHours);
        System.out.println(" totalWage wage for month "+ totalWage);

    }
}
