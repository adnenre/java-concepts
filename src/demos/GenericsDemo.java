package demos;

import tools.Logger;
import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}

class Util {
    public static <T> T getMiddle(T[] array) {
        return array[array.length / 2];
    }
}

public class GenericsDemo {
    public static void run() {
        Logger.banner("GENERICS DEMO");
        Logger.log("Generics provide type safety and eliminate casting.", "info");
        Logger.println();

        // Generic class
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        Logger.log("String box: " + stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        Logger.log("Integer box: " + intBox.get());
        Logger.println();

        // Generic method
        String[] words = { "apple", "banana", "cherry" };
        String middle = Util.getMiddle(words);
        Logger.log("Middle of array: " + middle);
        Logger.println();

        // Bounded type
        Logger.log("Sum of 10 and 20.5 = " + addNumbers(10, 20.5));
        Logger.println();

        // Wildcards
        List<Integer> ints = List.of(1, 2, 3);
        List<Double> doubles = List.of(1.5, 2.5, 3.5);
        printNumbers(ints);
        printNumbers(doubles);
    }

    private static <T extends Number> double addNumbers(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    private static void printNumbers(List<? extends Number> nums) {
        for (Number n : nums)
            Logger.print(n + " ");
        Logger.println();
    }
}