package com.inheritance.e_commerce_system;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- 🛒 Amazon / Flipkart Simulation --- \n");

        // Test 1: Smartphone (Level 4 Leaf Node)
        System.out.println(">> TEST 1: SMARTPHONE");
        Smartphone phone = new Smartphone("P101", "iPhone 15", 79999, 0.18, 50, 12, 6);
        phone.displayBasicDetails(); // Inherited from Product (Level 1)
        phone.shipProduct();         // Inherited from PhysicalProduct (Level 2)
        phone.checkWarranty();       // Inherited from Electronics (Level 3)
        phone.bootOS();              // From Smartphone itself (Level 4)
        System.out.println("Grand Total: ₹" + phone.calculateTotalCost());

        System.out.println("\n-----------------------------------------------\n");

        // Test 2: TShirt (Level 4 Leaf Node)
        System.out.println(">> TEST 2: CLOTHING");
        TShirt shirt = new TShirt("A202", "Puma Sports Tee", 1299, 0.15, 40, "L", "Polyester", "Never Give Up");
        shirt.displayBasicDetails(); // From Product
        shirt.tryOn();               // From Apparel
        shirt.displayDesign();       // From TShirt
        System.out.println("Grand Total: ₹" + shirt.calculateTotalCost());

        System.out.println("\n-----------------------------------------------\n");

        // Test 3: EBook (Digital Flow)
        System.out.println(">> TEST 3: DIGITAL EBOOK");
        EBook book = new EBook("D303", "Java: The Complete Reference", 450, "https://store.com", 1200);
        book.displayBasicDetails(); // From Product
        book.deliverViaEmail();     // From DigitalProduct
        book.openReader();          // From EBook
        // Notice: book.calculateTotalCost() ya shipProduct() yahan access nahi hoga kyunki yeh DigitalProduct se hai!
    }
}