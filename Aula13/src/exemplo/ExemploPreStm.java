package exemplo;

import java.sql.*;

import javax.swing.JOptionPane;

public class ExemploPreStm {
	public static void main(String[] args) {
		try {
			String d = "jdbc:mysql://localhost/java_curso?user=root&password=";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection(d);
			System.out.println("OK");

			String sql = "update usuarios set senha=? where id=?";
			PreparedStatement prm = conn.prepareStatement(sql);
			
			prm.setString(1, JOptionPane.showInputDialog("Qual a senha a ser alterada"));
			prm.setInt(2, Integer.parseInt(JOptionPane.showInputDialog("Qual id do usuario ?")));
			prm.execute();
			
			ResultSet rs = conn.createStatement().executeQuery("Select * from usuarios");
			
			while (rs.next()) {
				System.out.println(rs.getString("id")+"  -  "+rs.getString("login")+"  -  "+rs.getString("senha"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
