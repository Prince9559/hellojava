package com.mycompany.hellojava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerUse {
    
    public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(System.in);
    
        String line = sc.nextLine();
        System.out.println(line);
        System.out.println("Out");
        System.err.println("Error");
        
    }
}
