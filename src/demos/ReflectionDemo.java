package demos;

import tools.Logger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class SecretClass {
    private String secret = "Hidden message";
    private int number = 42;

    public SecretClass() {
    }

    private void whisper() {
        Logger.log("Whisper: This is a private method.");
    }

    public void greet(String name) {
        Logger.log("Hello, " + name + "!");
    }
}

public class ReflectionDemo {
    public static void run() throws Exception {
        Logger.banner("REFLECTION DEMO");
        Logger.log("Reflection allows inspecting and modifying classes at runtime.", "info");
        Logger.println();

        // Get Class object
        Class<?> clazz = SecretClass.class;
        Logger.log("Class name: " + clazz.getName());

        // List all declared fields
        Logger.log("\n--- Fields ---");
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            Logger.log("Field: " + f.getName() + " (type: " + f.getType().getSimpleName() + ")");
        }

        // List all declared methods
        Logger.log("\n--- Methods ---");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            Logger.log("Method: " + m.getName());
        }

        // Access private field
        Logger.log("\n--- Accessing private field ---");
        SecretClass obj = new SecretClass();
        Field secretField = clazz.getDeclaredField("secret");
        secretField.setAccessible(true); // bypass private
        Logger.log("Original secret: " + secretField.get(obj));
        secretField.set(obj, "Modified by reflection");
        Logger.log("Modified secret: " + secretField.get(obj));

        // Invoke private method
        Logger.log("\n--- Invoking private method ---");
        Method whisperMethod = clazz.getDeclaredMethod("whisper");
        whisperMethod.setAccessible(true);
        whisperMethod.invoke(obj);

        // Invoke public method
        Logger.log("\n--- Invoking public method ---");
        Method greetMethod = clazz.getMethod("greet", String.class);
        greetMethod.invoke(obj, "Reflection");

        // Show constructors
        Logger.log("\n--- Constructors ---");
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> c : constructors) {
            Logger.log("Constructor: " + c.getName());
        }

        Logger.println();
        Logger.log("Reflection is powerful but should be used sparingly (performance, security).", "warning");
    }
}