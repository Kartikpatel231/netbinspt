/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.*;
/**
 *
 * @author abc
 */
public class database {
    public static void main(String[] arg) throws Exception{
 //   String url=;
   // String uname="root";
   // String pass="root";
    String query="select username from student where user id=1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university,root,root");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String name=rs.getString("username");
        System.out.println(name);
        st.close();
        con.close();
    
    }
}
