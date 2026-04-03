package demos;

import tools.Logger;

public class AdvancedTopicsDemo {
    public static void run() {
        Logger.banner("ADVANCED TOPICS (CONCEPTUAL)");
        Logger.log("This demo provides explanations and small snippets for advanced Java topics.", "info");
        Logger.println();

        // 1. JDBC (Database Access)
        Logger.banner("1. JDBC – Java Database Connectivity");
        Logger.log("JDBC allows Java to interact with relational databases (MySQL, PostgreSQL, etc.).", "info");
        Logger.log("Steps:");
        Logger.log("  1. Load driver: Class.forName(\"com.mysql.cj.jdbc.Driver\");");
        Logger.log("  2. Connect: DriverManager.getConnection(url, user, password);");
        Logger.log("  3. Create statement: conn.createStatement();");
        Logger.log("  4. Execute query: stmt.executeQuery(\"SELECT * FROM users\");");
        Logger.log("  5. Process ResultSet.");
        Logger.println();
        Logger.log("Example snippet:");
        Logger.log("  try (Connection conn = DriverManager.getConnection(url);");
        Logger.log("       Statement stmt = conn.createStatement();");
        Logger.log("       ResultSet rs = stmt.executeQuery(\"SELECT name FROM users\")) {");
        Logger.log("      while (rs.next()) System.out.println(rs.getString(\"name\"));");
        Logger.log("  } catch (SQLException e) { e.printStackTrace(); }");
        Logger.println();

        // 2. NIO.2 (New I/O)
        Logger.banner("2. NIO.2 – New I/O (Java 7+)");
        Logger.log("NIO.2 provides better file I/O with Path, Files, and asynchronous channels.", "info");
        Logger.log("Key classes: java.nio.file.Path, java.nio.file.Files");
        Logger.println();
        Logger.log("Example: reading all lines from a file");
        Logger.log("  Path path = Paths.get(\"data.txt\");");
        Logger.log("  List<String> lines = Files.readAllLines(path);");
        Logger.log("  lines.forEach(System.out::println);");
        Logger.println();
        Logger.log("Also supports walking file trees (Files.walk()), copying/moving, and symbolic links.");
        Logger.println();

        // 3. Networking (Sockets, HTTP)
        Logger.banner("3. Networking – Sockets & HTTP");
        Logger.log("Java provides java.net.Socket and ServerSocket for TCP communication.", "info");
        Logger.log("Client: Socket socket = new Socket(\"localhost\", 8080);");
        Logger.log("Server: ServerSocket server = new ServerSocket(8080); Socket client = server.accept();");
        Logger.println();
        Logger.log("HTTP clients: HttpURLConnection (built-in) or modern HttpClient (Java 11+).");
        Logger.log("  HttpClient client = HttpClient.newHttpClient();");
        Logger.log(
                "  HttpRequest request = HttpRequest.newBuilder().uri(URI.create(\"https://api.example.com\")).build();");
        Logger.log("  HttpResponse<String> response = client.send(request, BodyHandlers.ofString());");
        Logger.println();

        // 4. Unit Testing (JUnit)
        Logger.banner("4. Unit Testing – JUnit");
        Logger.log("JUnit is the standard framework for unit testing in Java.", "info");
        Logger.log("Annotations: @Test, @BeforeEach, @AfterEach, @BeforeAll, @AfterAll");
        Logger.println();
        Logger.log("Example JUnit 5 test:");
        Logger.log("  import org.junit.jupiter.api.Test;");
        Logger.log("  import static org.junit.jupiter.api.Assertions.*;");
        Logger.log("  class CalculatorTest {");
        Logger.log("      @Test void testAdd() {");
        Logger.log("          assertEquals(5, new Calculator().add(2,3));");
        Logger.log("      }");
        Logger.log("  }");
        Logger.println();

        // 5. Logging Frameworks (Log4j, SLF4J)
        Logger.banner("5. Logging Frameworks – Log4j, SLF4J");
        Logger.log("Logging frameworks replace System.out with configurable, hierarchical logging.", "info");
        Logger.log("Popular: Log4j 2, Logback, SLF4J (abstraction layer).");
        Logger.println();
        Logger.log("Example with Log4j 2 (log4j2.xml configuration):");
        Logger.log("  import org.apache.logging.log4j.LogManager;");
        Logger.log("  import org.apache.logging.log4j.Logger;");
        Logger.log("  Logger logger = LogManager.getLogger(MyClass.class);");
        Logger.log("  logger.info(\"Application started\");");
        Logger.log("  logger.error(\"Something went wrong\", exception);");
        Logger.println();

        // 6. Java Module System (JPMS)
        Logger.banner("6. Java Module System (JPMS) – Java 9+");
        Logger.log("Modules encapsulate packages with module-info.java declarations.", "info");
        Logger.log("module-info.java example:");
        Logger.log("  module com.myapp {");
        Logger.log("      requires java.sql;");
        Logger.log("      exports com.myapp.api;");
        Logger.log("  }");
        Logger.println();
        Logger.log("Benefits: strong encapsulation, reliable configuration, improved performance.");
        Logger.println();

        // 7. Serialization
        Logger.banner("7. Serialization");
        Logger.log("Serialization converts objects to byte streams (to save to file or send over network).", "info");
        Logger.log("Implement java.io.Serializable interface (marker interface).");
        Logger.println();
        Logger.log("Example:");
        Logger.log("  class Person implements Serializable {");
        Logger.log("      private String name;");
        Logger.log("      private int age;");
        Logger.log("      // transient fields are not serialized");
        Logger.log("      private transient String password;");
        Logger.log("  }");
        Logger.log(
                "  // Write: ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(\"person.ser\"));");
        Logger.log("  //        oos.writeObject(person);");
        Logger.log("  // Read:  ObjectInputStream ois = new ObjectInputStream(new FileInputStream(\"person.ser\"));");
        Logger.log("  //        Person p = (Person) ois.readObject();");
        Logger.println();
        Logger.log("Note: Serialization can be a security risk – use with caution.");
        Logger.println();

        Logger.log("These advanced topics are essential for professional Java development.", "success");
        Logger.log("Explore them further with dedicated tutorials and documentation.", "info");
    }
}