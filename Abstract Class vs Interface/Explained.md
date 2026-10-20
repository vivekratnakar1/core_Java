# 📘 Java Concepts: Abstract Class vs Interface__________________

## 🟥 Abstract Class (अब्स्ट्रैक्ट क्लास) ---An abstract class is ideal when subclasses share a common state and behavior.
            
            
                      ### 📌 Key Features:
            * **Declaration:**          Declared using the `abstract` class keyword.
            * **Methods:**             Can have both <span style="color: #d9534f;">**abstract methods**</span> (no body) and **concrete methods** (with a body).
            * **Variables:**             Can have instance variables (state).
            * **Constructors:**             Can have constructors.
            * **Inheritance:**                 A class can extend only **one** abstract class → <span style="color: #d9534f;">**Single Inheritance**</span>.
            * **Access Modifiers:**              Methods and fields can be `private`, `protected`, `public`, or `default`
            
            Ideal when subclasses share common state + behavior

==================================================================================================================================
## 🟢 Interface
An interface is a blueprint of a class and is used to achieve full abstraction and multiple inheritance.

### 📌 Key Features:
* **Declaration:** Declared using the `interface` keyword.
* **Methods:** By default, all methods are abstract (until Java 8, which introduced default/static methods).
* **Variables:** Variables are implicitly `public static final` (constants).
* **Inheritance:** A class can implement **multiple** interfaces → <span style="color: #5cb85c;">**Multiple Inheritance**</span>.
  
