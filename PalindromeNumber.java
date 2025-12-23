package com.mycompany.hellojava;
import java.util.Scanner;

public class PalindromeNumber {
    
    public static void main(String[]agrs)
    {
        
        System.out.print("Enter the Name :");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
      
        String n=name.toLowerCase();
        String p="";
       
        for(int i=n.length()-1;i>=0;i--)
        {
         p=p+n.charAt(i);
        }
        
        if(n.equals(p))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not Palindrome");
        }
    
     }
        
}
    

