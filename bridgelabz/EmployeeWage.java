package com.bl.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int WagePerHr=20;
        int IsPartTime=1;

        double empCheck=Math.floor(Math.random() * 2);

        if(empCheck == 1){
            int DailyWage=(8 * WagePerHr);
            System.out.println("Daily wage = "+DailyWage);
        }

        else{

            int DailyWage = (4 * WagePerHr);

            System.out.println("Daily wage = "+DailyWage);
        }

    }
}

