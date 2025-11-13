package com.mycompany.hellojava;
import java.util.Scanner;

public class ScannerJava { 
    
   public static void main(String[] args) {
        
       int a;
       int b;
       
       Scanner s=new Scanner(System.in);
       
       System.out.print("Enter the value A :");
       a=s.nextInt();
       
       System.out.print("Enter the value B :");
       b=s.nextInt();
       
       int sum=a+b;
       
       System.out.print(sum);
             
    }
}
