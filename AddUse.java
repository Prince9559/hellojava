package com.mycompany.hellojava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddUse {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileInputStream("add.txt"));

//      System.out.println("Enter a number : ");

        int sum = 0;

        while (sc.hasNextInt()) 
        {
            int value = sc.nextInt();
            sum += value;
        }
        System.out.println(sum);
    }
}
