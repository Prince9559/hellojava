package com.mycompany.hellojava;
import java.util.Scanner;
 
public class CheckPalindromeWhile {

   public static void main(String[]agrs)
   {
       System.out.print("Enter the name :");
       Scanner sc=new Scanner(System.in);
       
       String name=sc.nextLine();
      
       String n=name.toLowerCase();
       String p="";
       
       int i=n.length()-1;
       
       while(i>=0)
       {
           p=p+n.charAt(i);
           i--;
       }
       
       if(n.equals(p))
       {
           System.out.print("Yes");
       }
       else
       {
           System.out.print("No");
       }
   }
}
