package demos;

import tools.Logger;

public class StringDemo {
    public static void run() {
        Logger.banner("STRING DEMO");

        // DESCRIPTION
        Logger.log("String is an immutable sequence of characters.", "info");
        Logger.log("Common methods:");
        Logger.log("  - length(), toUpperCase(), toLowerCase()");
        Logger.log("  - substring(start, end), charAt(index)");
        Logger.log("  - equals(), compareTo()");
        Logger.log("  - StringBuilder for mutable strings");
        Logger.println();

        // EXAMPLES
        String str = "Hello, Java!";
        Logger.log("Original: " + str, "info");
        Logger.log("Length: " + str.length());
        Logger.log("Uppercase: " + str.toUpperCase());
        Logger.log("Substring (0,5): " + str.substring(0, 5));

        // String comparison
        String s1 = "hello";
        String s2 = "hello";
        if (s1.equals(s2)) {
            Logger.log("s1 equals s2", "success");
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is fun");
        Logger.log("StringBuilder: " + sb.toString());
    }
}