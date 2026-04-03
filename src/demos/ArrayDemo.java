package demos;

import tools.Logger;

public class ArrayDemo {
    public static void run() {
        Logger.banner("ARRAY DEMO");

        // DESCRIPTION & USAGE
        Logger.log("An array is a container that holds a fixed number of values of a single type.", "info");
        Logger.log("How to use:");
        Logger.log("  - Declare: int[] numbers;");
        Logger.log("  - Initialize: numbers = new int[5]; or int[] nums = {1,2,3};");
        Logger.log("  - Access: numbers[index] = value;");
        Logger.log("  - Length: numbers.length");
        Logger.println();

        // EXAMPLES
        // 1. Declare and initialize
        int[] numbers = { 10, 20, 30, 40, 50 };
        Logger.log("Array elements:", "info");
        for (int i = 0; i < numbers.length; i++) {
            Logger.log("  index " + i + " = " + numbers[i]);
        }

        // 2. Modify an element
        numbers[2] = 99;
        Logger.log("After changing index 2 to 99:", "info");
        for (int num : numbers) {
            Logger.print(num + " ");
        }
        Logger.println();

        // 3. 2D array
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        Logger.log("2D array (matrix):", "info");
        for (int[] row : matrix) {
            for (int val : row) {
                Logger.print(val + " ");
            }
            Logger.println();
        }
    }
}