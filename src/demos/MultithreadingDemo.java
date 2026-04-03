package demos;

import tools.Logger;

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            Logger.log(name + " - count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            Logger.log(name + " (Runnable) - count: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }
}

public class MultithreadingDemo {
    public static void run() throws InterruptedException {
        Logger.banner("MULTITHREADING DEMO");
        Logger.log("Threads allow concurrent execution.", "info");
        Logger.println();

        // Thread extension
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        Logger.println();

        // Runnable
        Thread r1 = new Thread(new MyRunnable("R1"));
        Thread r2 = new Thread(new MyRunnable("R2"));
        r1.start();
        r2.start();
        r1.join();
        r2.join();
        Logger.println();

        // Synchronization
        Counter c = new Counter();
        Thread inc1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.increment();
        });
        Thread inc2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.increment();
        });
        inc1.start();
        inc2.start();
        inc1.join();
        inc2.join();
        Logger.log("Synchronized counter: " + c.getValue(), "success");
    }
}