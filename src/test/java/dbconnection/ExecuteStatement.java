package dbconnection;

import lombok.SneakyThrows;

import java.sql.ResultSet;

public class ExecuteStatement extends DBConnector {

    @SneakyThrows
    public ResultSet getDataFromTable() {
        String query = "SELECT * FROM clients;";
        return statement.executeQuery(query);
    }

    @SneakyThrows
    public static void addNameToTable() {
        String query = "INSERT INTO clients (name) VALUES ('Tom');";
        statement.executeUpdate(query);
    }
}
