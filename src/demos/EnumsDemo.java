package demos;

import tools.Logger;

enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

enum Status {
    SUCCESS(200, "OK"), ERROR(500, "Server Error");

    private int code;
    private String msg;

    Status(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

enum Operation {
    ADD {
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUB {
        public double apply(double x, double y) {
            return x - y;
        }
    };

    public abstract double apply(double x, double y);
}

public class EnumsDemo {
    public static void run() {
        Logger.banner("ENUMS DEMO");
        Logger.log("Enums define fixed sets of constants.", "info");
        Logger.println();

        Logger.log("Today: " + Day.WED);
        Logger.log("Ordinal: " + Day.WED.ordinal());
        Logger.println();

        Status s = Status.SUCCESS;
        Logger.log(s + " - " + s.getCode() + ": " + s.getMsg());
        Logger.println();

        double a = 10, b = 5;
        for (Operation op : Operation.values()) {
            Logger.log(op + " of " + a + " & " + b + " = " + op.apply(a, b));
        }
        Logger.println();

        Logger.log("All days:");
        for (Day d : Day.values())
            Logger.print(d + " ");
        Logger.println();
    }
}