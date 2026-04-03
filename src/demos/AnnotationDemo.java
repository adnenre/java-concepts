package demos;

import tools.Logger;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String priority() default "LOW";

    String description();
}

class Task {
    @Todo(priority = "HIGH", description = "Implement login")
    public void login() {
    }

    @Deprecated
    public void old() {
    }
}

public class AnnotationDemo {
    public static void run() {
        Logger.banner("ANNOTATIONS DEMO");
        Logger.log("Annotations add metadata to code.", "info");
        Logger.println();

        Task t = new Task();
        t.old(); // deprecated warning but works

        for (Method m : Task.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);
                Logger.log("Method: " + m.getName());
                Logger.log("  Priority: " + todo.priority());
                Logger.log("  Description: " + todo.description());
            }
        }
        Logger.println();
        Logger.log("Custom annotations can be processed at runtime via reflection.", "success");
    }
}