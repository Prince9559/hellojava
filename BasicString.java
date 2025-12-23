package com.mycompany.hellojava;

public class BasicString {
    
    public static void main(String[]agrs)
    {
        
   
   String firstName = "John";
   String lastName = "Doe";
   String fullName = firstName + " " + lastName;
   System.out.println(fullName);
   int length = fullName.length();
   
   System.out.println(length);
   
   String substring = fullName.substring(0, 4);
   System.out.println(substring);
        
   boolean isEqual = firstName.equals(lastName);
   System.out.println(isEqual);
   
   int indexOfJava = fullName.indexOf("Java");
   System.out.println(indexOfJava);
   
   int age = 25;
   System.out.println(age);
   
   }
    
}
