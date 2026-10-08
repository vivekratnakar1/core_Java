package com.core_java_7oct26_StringPool;

public class StringPoolPoc {
    public static void main(String[] args) {
        
        // 1. String Literals (String Pool mein jayenge)
        String s1 = "hello";
        String s2 = "Hello";

        // 2. Using 'new' Keyword (General Heap memory mein jayenge)
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println("--- MEMORY REFERENCE COMPARISON (==) ---");
        
        // True: Kyunki dono pool ke same object ko point kar rahe hain
        System.out.println("s1 == s2 : " + (s1 == s2)); 

        // False: Kyunki s3 heap mein ek naya object hai
        System.out.println("s1 == s3 : " + (s1 == s3)); 

        // False: Kyunki s3 aur s4 heap mein do alag-alag objects hain
        System.out.println("s3 == s4 : " + (s3 == s4)); 


        System.out.println("\n--- CONTENT COMPARISON (.equals) ---");
        
        // True: Kyunki sabhi ka text content "Hello" hi hai
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); 


        System.out.println("\n--- INTERN METHOD MAGIC ---");
        
        // intern() method heap object ka pool waala reference return karta hai
        String s5 = s3.intern(); 
        
        // True: Kyunki s5 ko pool se wahi reference mila jo s1 ke paas hai
        System.out.println("s1 == s5 : " + (s1 == s5)); 
    }
}
