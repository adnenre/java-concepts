package demos;

import tools.Logger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class DateTimeDemo {
    public static void run() {
        Logger.banner("DATE & TIME API DEMO");
        Logger.log("java.time package (Java 8+) – immutable, thread‑safe.", "info");
        Logger.println();

        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        Logger.log("Today: " + today);
        Logger.log("Now: " + now);
        Logger.log("DateTime: " + dt);
        Logger.println();

        LocalDate birthday = LocalDate.of(1990, 5, 15);
        Logger.log("Birthday: " + birthday);
        Logger.log("Next week: " + today.plusWeeks(1));
        Logger.log("Last month: " + today.minusMonths(1));
        Logger.println();

        Period age = Period.between(birthday, today);
        Logger.log("Age: " + age.getYears() + " years");
        long days = ChronoUnit.DAYS.between(birthday, today);
        Logger.log("Days since birthday: " + days);
        Logger.println();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Logger.log("Formatted: " + today.format(fmt));
        LocalDate parsed = LocalDate.parse("25/12/2024", fmt);
        Logger.log("Parsed: " + parsed);
    }
}