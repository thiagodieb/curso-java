package exemplo;

import java.sql.*;

public class ExemploStm {
	public static void main(String[] args) {
		try {
			String d = "jdbc:mysql://localhost/java_curso?user=root&password=";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(d);
			System.out.println("OK");

			Statement stm = conn.createStatement();
			
			//stm.execute("insert into usuarios (id, nome, login,senha) values (NULL,'Edicleide','edi','123123')");
			stm.execute("update usuarios set senha='0987'");
			
			ResultSet rs = stm.executeQuery("Select * from usuarios");
			
			while (rs.next()) {
				System.out.println(rs.getString("id")+"  -  "+rs.getString("login")+"  -  "+rs.getString("senha"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
