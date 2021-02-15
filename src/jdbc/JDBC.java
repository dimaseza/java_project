package jdbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class JDBC {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_coba";
            String username = "root";
            String password = "";
            Connection connection = (Connection) DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
        } catch (Exception e) {
            System.out.println("Connection error");
        }
    }
}
