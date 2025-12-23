package com.mycompany.hellojava;
import java.util.Scanner;

public class CheckGmail {

    public static void main(String[] agrs) 
    {
        System.out.print("Enter the Gmail : ");
        
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        System.out.println(email);

        int countAt=0;
        
        for (int i=0;i<email.length();i++) 
        {
        if(email.charAt(i)=='@') 
        {
           countAt++;
        }
        }

        boolean Letter = Character.isLetter(email.charAt(0));
        boolean at = email.contains("@");
        boolean dot = email.contains(".");
        
        if (countAt == 1 && Letter && at && dot) 
        {
            System.out.println("Valid Gmail");
        } 
        else 
        {
            System.out.println("Invalid Gmail");
        }
    }
}
