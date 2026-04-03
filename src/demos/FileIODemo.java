package demos;

import tools.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIODemo {
    public static void run() {
        Logger.banner("FILE I/O DEMO");

        // DESCRIPTION
        Logger.log("File I/O lets you read/write files.", "info");
        Logger.log("Classes: File, FileWriter, FileReader, Files (NIO)");
        Logger.log("  - Use try-with-resources for automatic closing");
        Logger.log("  - Check file existence with exists()");
        Logger.println();

        String fileName = "demo.txt";

        // Write to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a demo file!\n");
            writer.write("Java file I/O is easy.");
            Logger.log("File written successfully: " + fileName, "success");
        } catch (IOException e) {
            Logger.log("Error writing file: " + e.getMessage(), "danger");
        }

        // Read from file
        try {
            String content = Files.readString(Paths.get(fileName));
            Logger.log("File content:", "info");
            Logger.log(content);
        } catch (IOException e) {
            Logger.log("Error reading file: " + e.getMessage(), "danger");
        }

        // File info
        File file = new File(fileName);
        if (file.exists()) {
            Logger.log("File exists: " + file.getName());
            Logger.log("Absolute path: " + file.getAbsolutePath());
            Logger.log("File size: " + file.length() + " bytes");
        }
    }
}