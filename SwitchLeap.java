package com.mycompany.hellojava;

public class SwitchLeap {
    
    
    public static void main(String[] args) {
        int year = 2024, days;
        switch (year % 400) {
            case 0:
                days = 29;
                break;
            default:
                switch (year % 4) {
                    default:
                        days = 28;
                        break;
                    case 0:
                        switch (year % 100) {
                            default:
                                days = 29;
                                break;
                            case 0:
                                days = 28;
                        }
                        break;

                }
        }
        System.out.println(days);
    }
}
