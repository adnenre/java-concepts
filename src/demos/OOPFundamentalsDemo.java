package demos;

import tools.Logger;

// ============================================================
// 1. ENCAPSULATION
//    Bundling data and methods, hiding internal state.
// ============================================================
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            Logger.log("Deposited $" + amount + " into account " + accountNumber);
        } else {
            Logger.log("Deposit amount must be positive", "warning");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            Logger.log("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            Logger.log("Insufficient funds or invalid amount", "danger");
        }
    }
}

// ============================================================
// 2. INHERITANCE
// ============================================================
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void honk() {
        Logger.log("Beep beep! from " + brand);
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public void displayDoors() {
        Logger.log(brand + " car has " + doors + " doors.");
    }
}

// ============================================================
// 3. POLYMORPHISM
// ============================================================
class Animal {
    public void sound() {
        Logger.log("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        Logger.log("Dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        Logger.log("Cat meows: Meow! Meow!");
    }
}

// ============================================================
// 4. ABSTRACTION
// ============================================================
abstract class Shape {
    abstract double area();

    public void display() {
        Logger.log("Area: " + area());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// ============================================================
// Main Demo Class
// ============================================================
public class OOPFundamentalsDemo {
    public static void run() {
        Logger.banner("OOP FUNDAMENTALS DEMO");

        Logger.banner("1. ENCAPSULATION");
        Logger.log("Definition: Hiding internal data and exposing controlled access via methods.", "info");
        BankAccount acc = new BankAccount("123456", 1000);
        Logger.log("Account: " + acc.getAccountNumber() + ", Balance: $" + acc.getBalance());
        acc.deposit(500);
        acc.withdraw(200);
        Logger.log("Final balance: $" + acc.getBalance());
        Logger.println();

        Logger.banner("2. INHERITANCE");
        Logger.log("Definition: A class (child) inherits fields and methods from another class (parent).", "info");
        Car myCar = new Car("Toyota", 4);
        myCar.honk();
        myCar.displayDoors();
        Logger.println();

        Logger.banner("3. POLYMORPHISM");
        Logger.log("Definition: Same method call behaves differently depending on the actual object type.", "info");
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
        Logger.println();

        Logger.banner("4. ABSTRACTION");
        Logger.log(
                "Definition: Hiding implementation details and showing only essential features (using abstract classes/interfaces).",
                "info");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Logger.log("Circle radius 5:");
        circle.display();
        Logger.log("Rectangle 4x6:");
        rectangle.display();
        Logger.println();

        Logger.log("These four concepts form the foundation of Object-Oriented Programming.", "success");
    }
}