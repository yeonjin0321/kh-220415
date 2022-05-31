package jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_oracle {

    public static void main(String[] args) throws SQLException{
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@172.30.1.54:1521:orcl";
        String userid = "scott";
        String passwd = "tiger";

        /*String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oralce:thin:@localhost:1521:orcl";
        String uerid = "scott";
        String passwd = "tiger";*/
        
       
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        /*Connection con = null;
        Statement stmt =null;
        Resultment rs = null;
        con/ stmt / rs 널값 지정해주기.
        */
        String sql = "select deptno, dname, loc from dept";
        //반드시 try catch문을 해줘야한다.
        try {
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:oracle:thin:@172.30.1.54:1521:orcl11", "scott", "tiger");
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql); //이해하기!

            while (rs.next()) {
                int deptno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String loc = rs.getString("loc");
                System.out.println(deptno + "," + dname + "," + loc);
            }
        } catch (ClassNotFoundException e) {
            e.getStackTrace();
        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if ( con != null) con.close();
            } catch (SQLException e) {
                e.getStackTrace();
            }
        }

    }

}
