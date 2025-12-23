package com.mycompany.hellojava;

public class EqualsAndEqualsIgnore {
    
    public static void main(String[]agrs)
    {
        
        String a="Hello";
        String b="hello";
        
        int n=a.charAt(5);
        System.out.println(n);
        
        System.out.println(a.equals(b));
        System.out.print(a.equalsIgnoreCase(b));
        
    }
    
}
