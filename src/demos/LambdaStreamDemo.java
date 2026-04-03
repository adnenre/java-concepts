package demos;

import tools.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamDemo {
    public static void run() {
        Logger.banner("LAMBDA & STREAMS DEMO");

        // DESCRIPTION
        Logger.log("Lambda expressions (->) and Streams (Java 8+) enable functional programming.", "info");
        Logger.log("Lambda: (param) -> expression");
        Logger.log("Stream: sequence of elements supporting aggregate operations.");
        Logger.log("Common operations: filter, map, reduce, forEach, collect.");
        Logger.println();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Lambda
        Logger.log("Names using lambda:", "info");
        names.forEach(name -> Logger.log("- " + name));

        // Stream filter and map
        List<String> longNames = names.stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        Logger.log("Names with length > 4 (uppercase):", "info");
        longNames.forEach(name -> Logger.log("- " + name));

        // Reduce
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        Logger.log("Sum of numbers: " + sum);

        // Method reference
        Logger.log("Printing numbers using method reference:");
        numbers.forEach(Logger::print);
        Logger.println();

        Logger.log("Lambda and streams make functional programming easy!", "success");
    }
}