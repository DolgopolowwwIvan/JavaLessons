package dmdev.jdbc.starter;

import dmdev.jdbc.starter.util.ConnectionManager;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JdbcRunner {

    public static void main(String[] args) throws SQLException {

//        Long flightId = 2L;
//        var result = getTicketsByFlightId(flightId);
//        System.out.println(result);
//
//        var result = getTicketsBetween(LocalDate.of(2020, 10, 1).atStartOfDay(),
//                LocalDateTime.now());

        checkMetaData();
    }

    private static void checkMetaData() throws SQLException {
        try (var connection = ConnectionManager.get()) {
            var metaData = connection.getMetaData();
            //var catalogs = metaData.getCatalogs();
            var schemas = metaData.getSchemas();

            while (schemas.next()){
                System.out.println(schemas.getString(1));
            }
        }
    }

    private static List<Long> getTicketsBetween(LocalDateTime start, LocalDateTime end) throws SQLException {
        String sql = """
                SELECT id
                FROM flight
                WHERE departure_date BETWEEN ? AND ?
                """;

        List<Long> result = new ArrayList<>();

        try (var connection = ConnectionManager.get();
             var prepareStatement = connection.prepareStatement(sql)) {
            System.out.println(prepareStatement);
            prepareStatement.setTimestamp(1, Timestamp.valueOf(start));
            System.out.println(prepareStatement);
            prepareStatement.setTimestamp(2, Timestamp.valueOf(end));
            System.out.println(prepareStatement);

            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                result.add(resultSet.getLong("id"));
            }
        }

        return result;
    }

    private static List<Long> getTicketsByFlightId(Long flightId) throws SQLException {
        String sql = """
                SELECT id 
                FROM ticket
                WHERE flight_id = ?
                """;

        List<Long> result = new ArrayList<>();
        try (var connection = ConnectionManager.get();
             var prepareStatement = connection.prepareStatement(sql)) {
            prepareStatement.setLong(1, flightId);

            var resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                result.add(resultSet.getLong("id"));
            }
        }

        return result;
    }

}


// Первые 7 уроков
//    Class<Driver> driverClass = Driver.class;
//
//    String sql = """
//                INSERT INTO info (data)
//                VALUES\s
//                    ('AQUA2')
//               \s""";
//
//        try (var connection = ConnectionManager.open();
//    var statement = connection.createStatement())
//    {
//        System.out.println(connection.getSchema());
//        System.out.println(connection.getTransactionIsolation());
//
//        var executeResult = statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
//        var generatedKeys = statement.getGeneratedKeys();
//
//        if (generatedKeys.next()){
//            var generatedId = generatedKeys.getInt("id");
//            System.out.println(generatedId);
//        }
//            while (executeResult.next()){
//                System.out.println(executeResult.getLong("id"));
//                System.out.println(executeResult.getString("passenger_no"));
//                System.out.println(executeResult.getBigDecimal("cost"));
//                System.out.println("--------");
//            }
//    }
//        catch (RuntimeException e) {
//        throw new RuntimeException(e);
//    }


