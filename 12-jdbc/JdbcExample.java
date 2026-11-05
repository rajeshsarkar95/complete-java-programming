import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");
        String sql = "SELECT id, name FROM students WHERE id = ?";

        if (user == null || password == null) {
            System.err.println("Set DB_USER and DB_PASSWORD environment variables.");
            return;
        }

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, 1);
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    System.out.println(result.getInt("id") + ": " + result.getString("name"));
                }
            }
        } catch (SQLException exception) {
            System.err.println("Database operation failed: " + exception.getMessage());
        }
    }
}
