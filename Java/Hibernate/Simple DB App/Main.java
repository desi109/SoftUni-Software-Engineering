import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        Properties properties = new Properties();

        properties.setProperty("user", "root");
        properties.setProperty("password", "Desi109pas");

        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/soft_uni?useTimezone=true&serverTimezone=UTC", properties);

        Statement statement = connection
                .prepareStatement("SELECT * FROM employees");

        ResultSet results = ((PreparedStatement) statement)
                .executeQuery();

        while (results.next()) {
            System.out.println(String.format("%s %s %s %s %s",
                    results.getString("employee_id"),
                    results.getString("first_name"),
                    results.getString("last_name"),
                    results.getString("job_title"),
                    results.getString("salary")));
        }


    }
}

