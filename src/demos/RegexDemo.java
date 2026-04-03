package demos;

import tools.Logger;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void run() {
        Logger.banner("REGEX DEMO");
        Logger.log("Regular expressions for pattern matching.", "info");
        Logger.println();

        String text = "The quick brown fox jumps over the lazy dog.";
        Pattern p = Pattern.compile("\\b\\w{4}\\b"); // 4-letter words
        Matcher m = p.matcher(text);
        Logger.log("4-letter words:");
        while (m.find())
            Logger.log("  " + m.group());
        Logger.println();

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        String[] emails = { "user@example.com", "invalid" };
        for (String email : emails) {
            boolean ok = email.matches(emailRegex);
            Logger.log(email + " → " + (ok ? "valid" : "invalid"), ok ? "success" : "danger");
        }
        Logger.println();

        String sentence = "Java 8, Java 11, Java 17";
        String replaced = sentence.replaceAll("Java (\\d+)", "JDK $1");
        Logger.log("Replaced: " + replaced);
    }
}