package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnection {
    // Khai báo đầy đủ các biến cấu hình kết nối
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/QuanLyGiaoVien";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "090206"; // Điền mật khẩu MySQL của bạn vào đây

    public static Connection getConnection() throws SQLException {
        // Đảm bảo nạp driver cho các phiên bản cũ nếu cần
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy MySQL Driver!");
        }
        
        // Sử dụng biến JDBC_PASS đã khai báo ở trên
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
}
