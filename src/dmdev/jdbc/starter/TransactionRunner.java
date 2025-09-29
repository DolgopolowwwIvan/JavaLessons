package dmdev.jdbc.starter;

import dmdev.jdbc.starter.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionRunner {
    public static void main(String[] args) throws SQLException {

        long flightId = 9L;
        var deleteFlightSql = """
                DELETE
                FROM flight
                WHERE id = ?
                """;

        Connection connection = null;
        PreparedStatement deleteFlightStatement = null;

        try {
            connection = ConnectionManager.get();
            deleteFlightStatement = connection.prepareStatement(deleteFlightSql);

            connection.setAutoCommit(false);

            deleteFlightStatement.setLong(1, flightId);

            connection.commit();
        } catch (Exception e) {
            if(connection != null){
                connection.rollback();
            }

            throw e;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (deleteFlightStatement != null) {
                deleteFlightStatement.close();
            }

        }
    }
}
