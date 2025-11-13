package com.mycompany.hellojava;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ProductList {

public static void main(String[]args)throws FileNotFoundException
{
    
    Scanner sc=new Scanner(new FileInputStream("list.txt"));
     
    
    while(sc.hasNextLine())
    {
    String line = sc.nextLine();   
    System.out.println(line);
 
    }
    
}
}
