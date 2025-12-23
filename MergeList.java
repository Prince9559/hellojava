package com.mycompany.hellojava;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class MergeList {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileInputStream("score.txt"));
        Scanner s = new Scanner(new FileInputStream("score1.txt"));
        
        PrintWriter pw = new PrintWriter(new FileOutputStream("out.txt"));

        TreeSet<Integer> set = new TreeSet<>();  

        while (sc.hasNextInt()) 
        {
            set.add(sc.nextInt());
        }
  
        while (s.hasNextInt()) 
        {
            set.add(s.nextInt());
        }

        for (int num : set) 
        {
            pw.print(num);
        }

        pw.flush();
        pw.close();
         
        System.out.print("Sorted merge complete");
    }
}
