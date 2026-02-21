/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseManager {
    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=LMS;encrypt=true;trustServerCertificate=true";
    private static final String USER = "admins";
    private static final String PASSWORD = "a@123456";

    // Get Database Connection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Database connection failed!", e);
        }
    }

    // INSERT, UPDATE, DELETE operations (Non-Select Queries)
    public static int executeUpdate(String sql, Object... params) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            setParameters(stmt, params);
            return stmt.executeUpdate(); // Returns number of affected rows

        } catch (SQLException e) {
            e.printStackTrace();
            return -1; // Error code
        }
    }

    // SELECT operation (Fetch Data)
    public static ResultSet executeQuery(String sql, Object... params) {
        try {
            Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            setParameters(stmt, params);
            return stmt.executeQuery(); // Returns ResultSet

        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Return null if query fails
        }
    }
public static void showmessage(String message){
     JOptionPane.showMessageDialog(null,message);
}

    // Helper Method: Set parameters dynamically in PreparedStatement
    private static void setParameters(PreparedStatement stmt, Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            stmt.setObject(i + 1, params[i]);
        }
    }
}
