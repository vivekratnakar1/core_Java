package com.core_java_7oct26_StringPool;

public class StringMemoryDemo {
    public static void main(String[] args) {
        
        // (== is compare _memory address_ and 
    	
        // CASE 1: String Literals (Stored in SCP)
        String s1 = "Java";
        String s2 = "Java";

        System.out.println("--- Case 1: Literals ---");// Points to the same object in SCP, so addresses are identical
        System.out.println("s1 == s2 : " + (s1 == s2)); // Output: true
 
        // CASE 2: Using 'new' Keyword (Stored in General Heap)
        // ==========================================================
        String s3 = new String("Java");

        System.out.println("\n--- Case 2: New Keyword ---");
        // s3 is a new object in the general heap, s1 is in the SCP
        System.out.println("s1 == s3 : " + (s1 == s3)); // Output: false
        
        // Content is identical, even if memory locations are different
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // Output: true
        
        
        // ==========================================================
        // CASE 3: Using intern() (Fetches from SCP)
        // ==========================================================
        String s4 = s3.intern();

        System.out.println("\n--- Case 3: Intern Method ---");
        // intern() returns the SCP reference, which matches s1
        System.out.println("s1 == s4 : " + (s1 == s4)); // Output: true
        
        
        // ==========================================================
        // CASE 4: String Concatenation at Runtime
        // ==========================================================
        String partial1 = "Ja";
        String partial2 = "va";
        String s5 = partial1 + partial2; // Created at runtime in Heap

        System.out.println("\n--- Case 4: Runtime Concatenation ---");
        // Dynamic concatenation creates a brand new object in the Heap
        System.out.println("s1 == s5 : " + (s1 == s5)); // Output: false
    }
}
