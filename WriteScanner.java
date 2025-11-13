
package com.mycompany.hellojava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class WriteScanner {
    
    public static void main(String[] agrs) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("data.txt"));
        PrintWriter pw =new PrintWriter(new FileOutputStream("out.txt"));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            pw.println(line);
            System.out.println(line);
        }
        pw.flush();
        pw.close();

    }

}
    

