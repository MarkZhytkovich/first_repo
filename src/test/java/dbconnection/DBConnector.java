package dbconnection;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

    public static Connection connect;
    public static Statement statement;

    public static void connect() {
        try {
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/course?"
                            + "user=root&password=admin");
            statement = connect.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @SneakyThrows
    public static void closeConnection() {
        if(statement != null) {
            statement.close();
        }
        if(connect != null) {
            connect.close();
        }
    }
}
