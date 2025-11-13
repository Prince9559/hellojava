package com.mycompany.hellojava;

public class SwitchLeapYear {
    
    public static void main(String[] args)
    {
        int year = 2024;
        
        switch((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))?1:0)
        {
            case 1:
                System.out.println("Leap Year");
                break;

            default:
                System.out.println("Not Leap Year");
        }
    }
}
