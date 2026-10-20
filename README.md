# Composition vs Inheritance in Java

A professional POC demonstrating **when** to use inheritance and **when** to use
composition in Java, using a real-world Indian food-delivery domain
(Zomato/Swiggy-style system).

## 🎯 The Problem

A food-delivery app has multiple vehicles:
- Petrol Bike
- Electric Bike
- Petrol Car
- Electric Car

Naive design uses **inheritance** — every combination requires a new subclass.
Adding a **Hybrid Car** tomorrow means creating yet another class. This is the
**combinatorial explosion** problem — classic **Liskov Substitution** violation.

Better design uses **composition** — a `DeliveryVehicle` *has-a* `Engine`, and
any engine can plug into any vehicle. This is **favor composition over inheritance**
— a principle from *Effective Java* (Item 18).

## 🧠 Key Takeaways

| Principle | Inheritance | Composition |
|---|---|---|
| Relationship | "is-a" | "has-a" |
| Coupling | Tight (subclass breaks if parent changes) | Loose (depend on interface) |
| Flexibility | Fixed at compile time | Swappable at runtime |
| Reuse | Code inherited | Behavior delegated |
| Best for | Genuine hierarchy with shared state | Reusable capabilities |

## ✅ Why Composition Wins Here

1. **Open for extension, closed for modification** — add `HybridEngine` without
   touching `DeliveryVehicle`.
2. **Testable** — mock `Engine` in unit tests.
3. **No Liskov violations** — every vehicle genuinely *can* use any engine.
4. **Runtime flexibility** — swap `PetrolEngine` for `ElectricEngine` on the fly.

## ▶️ Run the Demo

```bash
mvn clean compile exec:java -Dexec.mainClass=com.example.delivery.DeliveryApplication
```

Or with plain javac:

```bash
javac -d out $(find src/main/java -name "*.java")
java -cp out com.example.delivery.DeliveryApplication
```

## 👨‍💻 Author

Built as a portfolio POC demonstrating clean OOP design in Java.
