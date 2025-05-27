import java.sql.*;

public class InsertAndUpdate {
    private static final String URL = "jdbc:sqlite:students.db";

    public void insertStudent(int id, String name) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)")) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("Inserted student: " + name);
        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    public void updateStudent(int id, String newName) {
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?")) {
            ps.setString(1, newName);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Updated student ID " + id);
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        InsertAndUpdate dao =  new InsertAndUpdate();
        dao.insertStudent(1, "Alice");
        dao.updateStudent(1, "Alicia");
    }
}