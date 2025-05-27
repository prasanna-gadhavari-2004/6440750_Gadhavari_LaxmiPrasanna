import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BasicJDBC {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // Change URL for MySQL
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}