package demos;

import tools.Logger;

// SRP example
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class SalaryCalculator {
    public double calculateAnnualBonus(Employee emp) {
        return emp.getSalary() * 0.1;
    }
}

class EmployeeRepository {
    public void saveToDatabase(Employee emp) {
        Logger.log("Saving " + emp.getName() + " to database (simulated).", "info");
    }
}

// OCP example
interface Discount {
    double apply(double amount);
}

class RegularDiscount implements Discount {
    public double apply(double amount) {
        return amount * 0.95;
    }
}

class VIPDiscount implements Discount {
    public double apply(double amount) {
        return amount * 0.80;
    }
}

class SeasonalDiscount implements Discount {
    public double apply(double amount) {
        return amount * 0.90;
    }
}

class PriceCalculator {
    public double calculate(double amount, Discount discount) {
        return discount.apply(amount);
    }
}

// LSP example
interface Bird {
    void move();
}

class Sparrow implements Bird {
    public void move() {
        Logger.log("Sparrow flies in the sky.", "success");
    }
}

class Penguin implements Bird {
    public void move() {
        Logger.log("Penguin swims in the water.", "success");
    }
}

// ISP example
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
        Logger.log("Human working...", "info");
    }

    public void eat() {
        Logger.log("Human eating...", "info");
    }
}

class Robot implements Workable {
    public void work() {
        Logger.log("Robot working...", "info");
    }
}

// DIP example
interface MessageSender {
    void send(String message);
}

class EmailSender implements MessageSender {
    public void send(String message) {
        Logger.log("Sending email: " + message, "info");
    }
}

class SmsSender implements MessageSender {
    public void send(String message) {
        Logger.log("Sending SMS: " + message, "info");
    }
}

class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void notify(String message) {
        sender.send(message);
    }
}

public class OOPDemo {
    public static void run() {
        Logger.banner("SOLID PRINCIPLES DEMO");
        Logger.log("SOLID: five design principles for maintainable software.", "info");
        Logger.println();

        // SRP
        Logger.banner("1. SINGLE RESPONSIBILITY PRINCIPLE (SRP)");
        Employee emp = new Employee("Alice", 50000);
        SalaryCalculator calc = new SalaryCalculator();
        double bonus = calc.calculateAnnualBonus(emp);
        Logger.log("Bonus for " + emp.getName() + ": $" + bonus);
        EmployeeRepository repo = new EmployeeRepository();
        repo.saveToDatabase(emp);
        Logger.println();

        // OCP
        Logger.banner("2. OPEN/CLOSED PRINCIPLE (OCP)");
        PriceCalculator pc = new PriceCalculator();
        double price = 100.0;
        Logger.log("Original: $" + price);
        Logger.log("Regular discount: $" + pc.calculate(price, new RegularDiscount()));
        Logger.log("VIP discount: $" + pc.calculate(price, new VIPDiscount()));
        Logger.log("Seasonal discount: $" + pc.calculate(price, new SeasonalDiscount()));
        Logger.println();

        // LSP
        Logger.banner("3. LISKOV SUBSTITUTION PRINCIPLE (LSP)");
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();
        sparrow.move();
        penguin.move();
        Logger.println();

        // ISP
        Logger.banner("4. INTERFACE SEGREGATION PRINCIPLE (ISP)");
        Human human = new Human();
        Robot robot = new Robot();
        human.work();
        human.eat();
        robot.work();
        Logger.println();

        // DIP
        Logger.banner("5. DEPENDENCY INVERSION PRINCIPLE (DIP)");
        NotificationService emailService = new NotificationService(new EmailSender());
        emailService.notify("Hello via Email!");
        NotificationService smsService = new NotificationService(new SmsSender());
        smsService.notify("Hello via SMS!");
        Logger.println();

        Logger.log("SOLID principles help create maintainable and scalable software.", "success");
    }
}