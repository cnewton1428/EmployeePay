package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your employee number?");
        String myEmployeeNumber = sc.nextLine();

        System.out.println("Please enter your pay rate");
        Double payRate = sc.nextDouble();

        System.out.println("How many hours have you worked?");
        int hours = sc.nextInt();

        //Checkings to be done; pay rate> 25 = invalid;

//        if (payRate < 0 || payRate > 25) {    //use or to satisfy either condition instead of just one
//            System.out.println("Invalid");
//        } else if (hours > 60) {
//            System.out.println("Invalid");
//        } else if (hours > 35 && hours < 60) { //OT calc
//            double overTime = (hours * payRate * 1.5);
//            System.out.printf("Overtime is " + overTime);
//        } else{
//            double regularPay = (hours * payRate);
//        System.out.printf("Regular pay is " + regularPay);
//        }

        double totalWeeklyPay= 0;
        double WeeklyPay= 0;
        if (payRate <0 || payRate >25) {
            System.out.println("Invalid");
        }else if (hours > 60){
            System.out.println("Invalid");
        } else if (hours >35 && hours< 60) { //the or did'nt check when the hours was >35; need and to do both
            int extraHrs = hours - 35;
            totalWeeklyPay = payRate * 35 + (extraHrs + (payRate * 1.5)); //Regular (payRate *35) and Extra (extraHrs+ (payRate*1.5))
        }else {
            totalWeeklyPay = hours * payRate;
        }
        System.out.println("Total pay: " + totalWeeklyPay);


    }

}