 package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Program {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl11";
		String sql = "SELECT * FROM MEMBER";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "scott", "tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
		String title = rs.getString("TITLE");
		System.out.println(title);
		}
		rs.close();
		st.close();
		con.close();
		
	}

}
