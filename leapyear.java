package com.mycompany.hellojava;

public class leapyear {

    public static void main(String[] args) {

        int year = 2024;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 
        {
         System.out.print("Leap Year");   
        }
        else
        {
         System.out.print("Not Leap Year");
        }
    }

}
