package tools;

public class Logger {
    // ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String BLUE = "\u001B[34m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";

    // Simple log with newline (no color, no prefix)
    public static void log(String message) {
        System.out.println(message);
    }

    // Print without newline (no color, no prefix) - for String
    public static void print(String message) {
        System.out.print(message);
    }

    // Print without newline for int (to support method reference)
    public static void print(int n) {
        System.out.print(n);
    }

    // Print with newline (no color, no prefix)
    public static void println(String message) {
        System.out.println(message);
    }

    // Print empty line
    public static void println() {
        System.out.println();
    }

    // Colored log with type prefix and newline
    public static void log(String message, String type) {
        String color;
        String prefix;

        switch (type.toLowerCase()) {
            case "success":
                color = GREEN;
                prefix = "[success] ";
                break;
            case "warning":
                color = YELLOW;
                prefix = "[warning] ";
                break;
            case "danger":
                color = RED;
                prefix = "[danger] ";
                break;
            case "info":
                color = BLUE;
                prefix = "[info] ";
                break;
            default:
                color = RESET;
                prefix = "[log] ";
        }

        System.out.println(color + prefix + message + RESET);
    }

    // Blue banner
    public static void banner(String title) {
        int width = 50;
        String border = BLUE + "#".repeat(width) + RESET;
        int side = 4;
        int inner = width - side * 2;
        int titleLen = title.length();
        int spaces = inner - titleLen;
        int leftSpaces = spaces / 2;
        int rightSpaces = spaces - leftSpaces;

        String middle = BLUE
                + "#".repeat(side)
                + " ".repeat(leftSpaces)
                + title
                + " ".repeat(rightSpaces)
                + "#".repeat(side)
                + RESET;

        System.out.println(border);
        System.out.println(middle);
        System.out.println(border);
    }
}