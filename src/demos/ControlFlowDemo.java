package demos;

import tools.Logger;

public class ControlFlowDemo {
    public static void run() {
        Logger.banner("CONTROL FLOW DEMO");

        // DESCRIPTION
        Logger.log("Control flow statements decide the order of execution.", "info");
        Logger.log("Types:");
        Logger.log("  - if/else: conditional branching");
        Logger.log("  - switch: multi-way branching");
        Logger.log("  - for/while/do-while: loops");
        Logger.println();

        // EXAMPLES
        // if-else
        int score = 85;
        if (score >= 90) {
            Logger.log("Grade: A", "success");
        } else if (score >= 80) {
            Logger.log("Grade: B", "success");
        } else {
            Logger.log("Grade: C or lower", "warning");
        }

        // switch (enhanced)
        String day = "Tuesday";
        switch (day) {
            case "Monday" -> Logger.log("Start of work week", "info");
            case "Tuesday", "Wednesday", "Thursday" -> Logger.log("Mid week", "info");
            case "Friday" -> Logger.log("TGIF!", "success");
            default -> Logger.log("Weekend!", "info");
        }

        // for loop
        Logger.log("Counting 1 to 5:", "info");
        for (int i = 1; i <= 5; i++) {
            Logger.print(i + " ");
        }
        Logger.println();

        // while loop
        int count = 3;
        Logger.log("Countdown:", "info");
        while (count > 0) {
            Logger.print(count + "... ");
            count--;
        }
        Logger.println("Go!");
    }
}