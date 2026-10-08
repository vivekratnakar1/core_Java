package com.core_java_7oct26_StringPool;

public class StringCompare {

    public static void main(String[] args) {

        // String literals compares
        String city1 = "Kodewala"; // SCP (String Pool) mein jayega
        String city2 = "Kodewala"; // Naya nahi banega, city1 ka hi reference city2 ko milega
        String city4 = "Kodewala1";
        String city5 = "Kodewala3";
        String city6 = "Kodewala1";
        String city7 = "Kodewala1";

        // equals() String ke CONTENT ko compare karta hai
        System.out.println(city1.equals(city2)); // false
        System.out.println(city1.equals(city4)); // false
        System.out.println(city1.equals(city5)); // false
        System.out.println(city1.equals(city6)); // false
        System.out.println(city1.equals(city7)); // false

        
        class User {

            String firstName;

            public User(String firstName) {

                super();

                this.firstName = firstName;
                
                
            }
        }
        // Do alag User objects create kiye
        User user1 = new User("firstName");  // Heap memory mein ek naya object banega
        User user2 = new User("firstName"); // Heap memory mein ek naya object banega

        // User class me humne equals() override kiya hai,
        // isliye name compare hoga
        System.out.println(user1.equals(user2)); // true
    }
}