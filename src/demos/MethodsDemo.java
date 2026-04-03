package demos;

import tools.Logger;

public class MethodsDemo {
    public static void run() {
        Logger.banner("METHODS DEMO");

        // DESCRIPTION
        Logger.log("Methods are reusable blocks of code.", "info");
        Logger.log("Syntax: [modifiers] returnType methodName(parameters) { body }");
        Logger.log("  - Can return values or be void");
        Logger.log("  - Can accept parameters");
        Logger.log("  - Can be static (called on class) or instance (called on object)");
        Logger.println();

        // EXAMPLES
        int sum = add(5, 3);
        Logger.log("5 + 3 = " + sum, "success");

        String greeting = greet("Alice");
        Logger.log(greeting, "info");

        printStars(5);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static String greet(String name) {
        return "Hello, " + name + "!";
    }

    private static void printStars(int n) {
        Logger.log("Printing " + n + " stars:", "info");
        for (int i = 0; i < n; i++) {
            Logger.print("* ");
        }
        Logger.println();
    }
}