package bank.diali;

import java.sql.*;

public class ConnectionToDB {
    Connection connection;
    Statement statement;

    public ConnectionToDB() {
        try {
            // Update the database URL, username, and password
            String url = "jdbc:mysql://localhost:3306/db_bank_diali";  // Change localhost to your MySQL host if needed
            String username = "root";  // Change with your MySQL username
            String password = "";  // Change with your MySQL password

            // Establishing the connection
            connection = DriverManager.getConnection(url, username, password);

            statement = connection.createStatement();

            if (connection != null) {
                System.out.println("Connected to the database successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
