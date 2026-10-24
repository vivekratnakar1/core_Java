# 🧵 Thread Synchronization in Java

[![Java Version](https://shields.io)](https://oracle.com)
[![License](https://shields.io)](LICENSE)
[![Concurrency](https://shields.io)](#)

A comprehensive guide and hands-on Proof of Concept (PoC) exploring **Java Intrinsic Locks** via the `synchronized` keyword. This repository demonstrates how to manage concurrent access to shared resources, prevent data corruption, and avoid race conditions.

---

## ⚡ The Problem: Race Conditions

When multiple threads read and write to a shared variable simultaneously without coordination, actions can overlap. This results in **data loss** and unpredictable system behaviour.

## 🛡️ The Solution: `synchronized`

The `synchronized` keyword acts as a mutual exclusion (Mutex) lock built directly into the Java language. It guarantees that **only one thread** can execute a protected block of code at any given time.

### Key Characteristics
* **Intrinsic Monitors:** Every object and class in Java has an implicit lock attached to it.
* **Structured Scope:** Locks are acquired automatically upon entering the block/method and released automatically upon exiting.
* **Exception Safety:** Even if the code throws a runtime error, Java safely releases the lock to prevent application deadlocks.

---

## 🏗️ Architecture & Locking Strategies

Java allows you to apply synchronization at different scopes depending on your concurrency performance needs:

### 1. Synchronized Method (Instance Level)
Locks the **current instance** (`this`). Other synchronized instance methods on the same object are blocked.
```java
public synchronized void increment() {
    this.counter++;
}
```

### 2. Synchronized Block (Fine-Grained)
Locks a **specific object target**. This is preferred over method synchronization as it minimizes the scope of locked code.
```java
private final Object lockTarget = new Object();

public void increment() {
    // Unlocked boilerplate code can go here...
    synchronized(lockTarget) {
        this.counter++; // Only this critical section is locked
    }
}
```

### 3. Static Synchronized Method (Class Level)
Locks the **Class object** (`YourClass.class`). It blocks all threads accessing any static synchronized methods across all instances of this class.
```java
public static synchronized void globalIncrement() {
    globalCounter++;
}
```

---

## 🚀 Running the Proof of Concept

### Prerequisites
* Java Development Kit (JDK) 17 or higher
* A terminal or your favourite IDE

### Setup & Execution
1. Clone the repository:
   ```bash
   git clone https://github.com
   cd java-thread-synchronization
   ```
2. Compile the implementation:
   ```bash
   javac SynchronizationPoC.java
   ```
3. Run the application:
   ```bash
   java SynchronizationPoC
   ```

---

## 📊 Core Synchronization Trade-Offs

| Advantage | Disadvantage |
| :--- | :--- |
| **Deadlock Protection:** Auto-releases locks on unexpected exceptions. | **No Timeouts:** Threads wait indefinitely if a lock is never released. |
| **Clean Syntax:** No manual boilerplates or explicit cleanups required. | **Coarse Control:** Cannot span locks across multiple independent methods. |
| **Memory Visibility:** Guarantees structural cache flushing via happens-before semantics. | **Performance Overhead:** Thread blocking and context-switching can slow down high-throughput apps. |

---

## 📜 License

Distributed under the MIT License. See `LICENSE` for more information.
