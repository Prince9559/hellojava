package com.mycompany.hellojava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProductScanner {
    
        public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileInputStream("score.txt"));

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num);
        }
 
    }
    
}
