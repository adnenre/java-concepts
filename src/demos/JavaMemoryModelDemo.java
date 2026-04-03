package demos;

import tools.Logger;

public class JavaMemoryModelDemo {
    public static void run() {
        Logger.banner("JAVA MEMORY MODEL & GARBAGE COLLECTION");
        Logger.log("This is a conceptual explanation – no executable code.", "info");
        Logger.println();
        Logger.log("Stack: stores local variables, method calls, primitive values.");
        Logger.log("Heap: stores objects and arrays.");
        Logger.log("When an object has no references, GC marks it for deletion.");
        Logger.log("GC runs automatically; you can suggest it with System.gc().");
        Logger.println();
        Logger.log("Example:");
        Logger.log("  int x = 5;        // x on stack");
        Logger.log("  Person p = new Person(); // p reference on stack, object on heap");
        Logger.log("  p = null;         // object becomes eligible for GC");
        Logger.println();
        Logger.log("Understanding memory helps avoid leaks and optimize performance.", "success");
    }
}