package exemplo;

import java.sql.*;

class Conexao {
	public static void main(String[] args) {
		try {
			String d = "jdbc:mysql://localhost/mysql?user=root&password=";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(d);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
