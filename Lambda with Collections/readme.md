 Common interview questions
Q1. What is a lambda expression in Java?

A lambda expression is a concise way to implement the single abstract method of a functional interface. It was introduced in Java 8 and is widely used with collections, streams, and functional programming.

Q2. Can we use lambda expressions without a functional interface?

A lambda requires a target functional interface type. It cannot be assigned to a variable using a standalone type such as Object without an appropriate target-type conversion.

Q3. What is the @FunctionalInterface annotation?

It tells the compiler that an interface is intended to have exactly one abstract method. The compiler reports an error if the interface violates that requirement. The annotation is optional.

Q4. Can a functional interface have default and static methods?

Yes. It can have multiple default and static methods, provided it still has exactly one abstract method. Public methods corresponding to those declared by Object do not count toward the single abstract method requirement.

Q5. What is the difference between a lambda expression and a method reference?

A lambda defines behavior inline, while a method reference refers to an existing method.
