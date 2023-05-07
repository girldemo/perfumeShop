package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
	private static String hostName = "localhost:3306";
    private static String dbName = "perfum";
    private static String user = "root"; 
    private static String password = "ichigo2002";
    private static String url = "jdbc:mysql://"+hostName+"/"+dbName;
	private static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Không thể nạp driver");
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		System.out.println(DBConnectionUtil.getConnection());
	}
}
