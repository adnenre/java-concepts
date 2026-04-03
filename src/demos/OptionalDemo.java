package demos;

import tools.Logger;
import java.util.Optional;

public class OptionalDemo {
    public static void run() {
        Logger.banner("OPTIONAL DEMO");
        Logger.log("Optional container to avoid NullPointerException.", "info");
        Logger.println();

        Optional<String> nonEmpty = Optional.of("Hello");
        Optional<String> empty = Optional.empty();

        Logger.log("nonEmpty.isPresent(): " + nonEmpty.isPresent());
        Logger.log("empty.isEmpty(): " + empty.isEmpty());
        Logger.println();

        Logger.log("orElse: " + empty.orElse("Default"));
        Logger.log("orElseGet: " + empty.orElseGet(() -> "Computed"));
        Logger.println();

        nonEmpty.ifPresent(v -> Logger.log("Value: " + v));
        Logger.println();

        Optional<Integer> len = nonEmpty.map(String::length);
        Logger.log("Length via map: " + len.orElse(-1));
        Logger.println();

        try {
            String val = empty.orElseThrow(() -> new RuntimeException("No value"));
        } catch (Exception e) {
            Logger.log("orElseThrow exception: " + e.getMessage(), "danger");
        }
    }
}