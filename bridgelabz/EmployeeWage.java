package com.bl.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        int IS_FULL_TIME = 1;
        //computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else {
            System.out.println("Employee is Absent");
        }
    }
}
