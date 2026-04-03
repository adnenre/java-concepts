package app;

import tools.Logger;
import demos.ArrayDemo;
import demos.ControlFlowDemo;
import demos.StringDemo;
import demos.MethodsDemo;
import demos.CollectionsDemo;
import demos.ExceptionDemo;
import demos.FileIODemo;
import demos.OOPDemo;
import demos.RecursionDemo;
import demos.LambdaStreamDemo;
import demos.OOPFundamentalsDemo;
import demos.GenericsDemo;
import demos.MultithreadingDemo;
import demos.EnumsDemo;
import demos.DateTimeDemo;
import demos.AnnotationDemo;
import demos.OptionalDemo;
import demos.ReflectionDemo;
import demos.RegexDemo;
import demos.JavaMemoryModelDemo;
import java.util.Scanner;
import demos.AdvancedTopicsDemo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            Logger.banner("JAVA LEARNING MENU");
            Logger.log("1. Arrays");
            Logger.log("2. Control Flow");
            Logger.log("3. Strings");
            Logger.log("4. Methods");
            Logger.log("5. Collections");
            Logger.log("6. Exception Handling");
            Logger.log("7. File I/O");
            Logger.log("8. SOLID Principles");
            Logger.log("9. Recursion");
            Logger.log("10. Lambda & Streams");
            Logger.log("11. OOP Fundamentals");
            Logger.log("12. Generics");
            Logger.log("13. Multithreading");
            Logger.log("14. Enums");
            Logger.log("15. Date & Time API");
            Logger.log("16. Annotations");
            Logger.log("17. Optional");
            Logger.log("18. Reflection");
            Logger.log("19. Regular Expressions");
            Logger.log("20. Java Memory Model & GC (Conceptual)");
            Logger.log("21. Advanced Topics (JDBC, NIO, Networking, JUnit, Logging, JPMS, Serialization)");
            Logger.log("0. Exit");
            Logger.print("\nChoose an option: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                Logger.log("Invalid input. Please enter a number.", "danger");
                continue;
            }

            switch (choice) {
                case 1 -> ArrayDemo.run();
                case 2 -> ControlFlowDemo.run();
                case 3 -> StringDemo.run();
                case 4 -> MethodsDemo.run();
                case 5 -> CollectionsDemo.run();
                case 6 -> ExceptionDemo.run();
                case 7 -> FileIODemo.run();
                case 8 -> OOPDemo.run();
                case 9 -> RecursionDemo.run();
                case 10 -> LambdaStreamDemo.run();
                case 11 -> OOPFundamentalsDemo.run();
                case 12 -> GenericsDemo.run();
                case 13 -> {
                    try {
                        MultithreadingDemo.run();
                    } catch (InterruptedException e) {
                        Logger.log("Thread interrupted", "danger");
                    }
                }
                case 14 -> EnumsDemo.run();
                case 15 -> DateTimeDemo.run();
                case 16 -> AnnotationDemo.run();
                case 17 -> OptionalDemo.run();
                case 18 -> {
                    try {
                        ReflectionDemo.run();
                    } catch (Exception e) {
                        Logger.log("Reflection error: " + e.getMessage(), "danger");
                    }
                }
                case 19 -> RegexDemo.run();
                case 20 -> JavaMemoryModelDemo.run();
                case 21 -> AdvancedTopicsDemo.run();
                case 0 -> {
                    Logger.log("Goodbye!", "success");
                    scanner.close();
                    return;
                }
                default -> Logger.log("Option not available. Try again.", "warning");
            }

            Logger.print("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }
}