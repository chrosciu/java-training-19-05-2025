package eu.chrost.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/hr"; // URL połączenia JDBC do PostgreSQL
        String user = "admin"; // Nazwa użytkownika bazy danych PostgreSQL
        String password = "admin"; // Hasło użytkownika bazy danych
        return DriverManager.getConnection(url, user, password);
    }

    public static void main(String[] args) {
        try (Connection connection = getConnection()) {
            System.out.println("Uzyskano połączenie: " + connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
