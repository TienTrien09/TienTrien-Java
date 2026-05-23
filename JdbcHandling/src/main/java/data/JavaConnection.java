package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaConnection {

    // Driver MySQL
    private static final String JDBC_DRIVER =
            "com.mysql.cj.jdbc.Driver";

    // Đường dẫn kết nối Database
    private static final String JDBC_URL =
            "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";

    // Username MySQL
    private static final String JDBC_USER = "hiu";

    // Password MySQL
    private static final String JDBC_PASS = "admin";

    // Hàm kết nối Database
    public static Connection getConnection() throws SQLException {

        try {

            // Load JDBC Driver
            Class.forName(JDBC_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println("Failure to load the JDBC driver");

            e.printStackTrace(System.out);
        }

        // Trả về kết nối
        return DriverManager.getConnection(
                JDBC_URL,
                JDBC_USER,
                JDBC_PASS
        );
    }

    // Close the ResultSet object
    public static void close(ResultSet rs) {

        try {

            if (rs != null) {

                rs.close();
            }

        } catch (SQLException sqle) {

            sqle.printStackTrace(System.out);
        }
    }

    // Close the PreparedStatement object
    public static void close(PreparedStatement stmt) {

        try {

            if (stmt != null) {

                stmt.close();
            }

        } catch (SQLException sqle) {

            sqle.printStackTrace(System.out);
        }
    }

    // Close the Connection object
    public static void close(Connection conn) {

        try {

            if (conn != null) {

                conn.close();
            }

        } catch (SQLException sqle) {

            sqle.printStackTrace(System.out);
        }
    }
}