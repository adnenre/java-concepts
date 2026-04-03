package demos;

import tools.Logger;

public class ExceptionDemo {
    public static void run() {
        Logger.banner("EXCEPTION HANDLING DEMO");

        // DESCRIPTION
        Logger.log("Exceptions handle runtime errors gracefully.", "info");
        Logger.log("Keywords: try, catch, finally, throw, throws");
        Logger.log("  - try: block that may throw exception");
        Logger.log("  - catch: handles specific exception");
        Logger.log("  - finally: always executes");
        Logger.log("  - throw: manually throw exception");
        Logger.println();

        // EXAMPLES
        // Try-catch
        try {
            int[] numbers = { 1, 2, 3 };
            Logger.log("Accessing index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger.log("Caught exception: " + e.getMessage(), "danger");
        }

        // Multiple catch blocks
        try {
            String str = null;
            Logger.log("String length: " + str.length());
        } catch (NullPointerException e) {
            Logger.log("NullPointerException: " + e.getMessage(), "danger");
        }

        // Finally block
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            Logger.log("Cannot divide by zero!", "warning");
        } finally {
            Logger.log("Finally block always executes", "info");
        }

        // Custom exception
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            Logger.log(e.getMessage(), "danger");
        }
    }

    private static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        Logger.log("Valid age: " + age);
    }
}