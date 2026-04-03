# 🚀 Java Concepts Playground

An interactive,**menu‑driven** Java workshop that demonstrates **core Java concepts** through live examples, all wrapped in a colorful console logger.  
Perfect for beginners and intermediate developers who want to explore Java features in a hands‑on way.\*

Each demo uses a custom coloured logger (`tools.Logger`) for clear, consistent output.  
Perfect for beginners and intermediate developers who want to **learn by doing**.

## 📦 Features

- **20+ interactive demos** – from basic syntax to advanced topics.
- **Custom coloured logger** – `Logger.log()`, `Logger.banner()`, coloured prefixes.
- **SOLID principles** explained with working code.
- **OOP fundamentals** (encapsulation, inheritance, polymorphism, abstraction).
- **Memory model & GC** explained conceptually.
- **Menu‑driven** – run exactly what you want to learn.
- **No external libraries** – pure Java, works out of the box.

## 🗂️ Project Structure

```bash
src/
├── tools/
│ └── Logger.java # custom logging with colours & banners
├── demos/
│ ├── ArrayDemo.java
│ ├── ControlFlowDemo.java
│ ├── StringDemo.java
│ ├── MethodsDemo.java
│ ├── CollectionsDemo.java
│ ├── ExceptionDemo.java
│ ├── FileIODemo.java
│ ├── OOPDemo.java # SOLID principles
│ ├── RecursionDemo.java
│ ├── LambdaStreamDemo.java
│ ├── OOPFundamentalsDemo.java # 4 pillars of OOP
│ ├── GenericsDemo.java
│ ├── MultithreadingDemo.java
│ ├── EnumsDemo.java
│ ├── DateTimeDemo.java
│ ├── AnnotationDemo.java
│ ├── OptionalDemo.java
│ ├── ReflectionDemo.java
│ ├── RegexDemo.java
│ └── JavaMemoryModelDemo.java # conceptual
└── app/
└── Main.java # main menu & entry point

```

## 🛠️ How to Run

### Prerequisites

- **Java JDK 11 or higher** (for `String.repeat()` used in `Logger`).
- A terminal / command prompt (or VS Code / IntelliJ).

### Compile & Run (from the terminal)

1. **Navigate to the `src` folder** inside the project:

```bash
cd src
```

Compile all Java files:

```bash
javac tools/Logger.java demos/\*.java app/Main.java

```

Run the application:

```bash
java app.Main
```

💡 Tip: If you use VS Code, just open the src folder and click Run on Main.java. The Java extension will handle compilation automatically.

🎮 Menu Options
When you run the program, you'll see a coloured menu:

````bash
##################################################
####             JAVA LEARNING MENU            ####
##################################################
1. Arrays
2. Control Flow (if/switch/loops)
3. Strings
4. Methods
5. Collections (ArrayList, HashMap)
6. Exception Handling
7. File I/O
8. Object-Oriented Programming (SOLID)
9. Recursion
10. Lambda & Streams
11. OOP Fundamentals (Encapsulation, Inheritance, Polymorphism, Abstraction)
12. Generics
13. Multithreading
14. Enums
15. Date & Time API
16. Annotations
17. Optional
18. Reflection
19. Regular Expressions
20. Java Memory Model & GC (Conceptual)
21. Advanced Topics (JDBC, NIO, Networking, JUnit, Logging, JPMS, Serialization)
0. Exit
Choose a number – the corresponding demo will run, showing explanations + live code examples.
```
````
