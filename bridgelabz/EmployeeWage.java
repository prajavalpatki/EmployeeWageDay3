package com.bl.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        int ISPARTTIME=1;
        int ISFULLTIME=2;
        int empRatePerHr=20;
        int NumOfWorkingDays=20;
        int TotalWorkingDays=1;
        int TotalEmpHr=0;
        int empHrs;

        while( TotalWorkingDays < NumOfWorkingDays)
        {
            TotalWorkingDays++;
            double num = Math.floor(Math.random() * 3);
            int x = (int) num;
            switch (x){
                case 0:
                    empHrs = 4;
                    break;
                case 1:
                    empHrs = 8;
                    break;
                default :
                    empHrs = 0;
                    break;
            }
            TotalEmpHr = TotalEmpHr + empHrs;
        }
        int TotalSalary = TotalEmpHr * empRatePerHr;
        System.out.println("Total wage ="+TotalSalary);
    }
}

