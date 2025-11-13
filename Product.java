package com.mycompany.hellojava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Product {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileInputStream("data.txt"));

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter the Product Name :");
//        String name=input.nextLine();
//        System.out.print(name);
    }

}
