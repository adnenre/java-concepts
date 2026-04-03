package demos;

import tools.Logger;

public class RecursionDemo {
    public static void run() {
        Logger.banner("RECURSION DEMO");

        // DESCRIPTION
        Logger.log("Recursion = method calls itself.", "info");
        Logger.log("Must have base case to stop recursion.");
        Logger.log("Common examples: factorial, fibonacci, tree traversal.");
        Logger.log("Can be less efficient than iteration but elegant for some problems.");
        Logger.println();

        // EXAMPLES
        int n = 5;
        int fact = factorial(n);
        Logger.log("Factorial of " + n + " = " + fact, "success");

        int fib = fibonacci(6);
        Logger.log("Fibonacci(6) = " + fib);

        Logger.log("Countdown from 5:", "info");
        countdown(5);

        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = sumArray(arr, arr.length - 1);
        Logger.log("Sum of array = " + sum);
    }

    private static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }

    private static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static void countdown(int n) {
        if (n == 0) {
            Logger.println("Blast off!");
            return;
        }
        Logger.print(n + "... ");
        countdown(n - 1);
    }

    private static int sumArray(int[] arr, int index) {
        if (index < 0)
            return 0;
        return arr[index] + sumArray(arr, index - 1);
    }
}