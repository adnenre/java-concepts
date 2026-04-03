package demos;

import tools.Logger;
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsDemo {
    public static void run() {
        Logger.banner("COLLECTIONS DEMO");

        // DESCRIPTION
        Logger.log("Collections are dynamic data structures.", "info");
        Logger.log("ArrayList: resizable array, allows duplicates.");
        Logger.log("  - add(), remove(), get(), size()");
        Logger.log("HashMap: key-value pairs, fast lookup.");
        Logger.log("  - put(), get(), containsKey()");
        Logger.println();

        // EXAMPLES
        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        Logger.log("Fruits list: " + fruits, "info");
        fruits.remove("Banana");
        Logger.log("After removing Banana: " + fruits);

        // HashMap
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        Logger.log("Ages: " + ages);
        Logger.log("Alice's age: " + ages.get("Alice"));
    }
}