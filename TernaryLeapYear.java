
package com.mycompany.hellojava;


public class TernaryLeapYear {
    
    
    
}
//
//package com.mycompany.hellojava;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Product {
//
//    public static void main(String[] args) throws FileNotFoundException {
//
//        // प्रोडक्ट और कीमत को स्टोर करने के लिए मैप
//        Map<String, Integer> products = new HashMap<>();
//
//        // फाइल से डेटा पढ़ना और मैप में डालना
//        Scanner sc = new Scanner(new FileInputStream("data.txt"));
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine();
//            String[] parts = line.split(" ");
//            if(parts.length == 2) {
//                String productName = parts[0];
//                int price = Integer.parseInt(parts[1]);
//                products.put(productName, price);
//            }
//        }
//        sc.close();
//
//        // यूजर से प्रोडक्ट नाम लेना
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the Product Name :");
//        String name = input.nextLine();
//
//        // प्राइस दिखाना
//        if(products.containsKey(name)) {
//            System.out.println("Price of " + name + " is " + products.get(name));
//        } else {
//            System.out.println("Product not found.");
//        }
//
//        input.close();
//    }
//}