/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prabhubank;
import java.sql.*;
/**
 *
 * @author Annoy
 */
public class DbConnection {
    public Connection getConnection()throws ClassNotFoundException,SQLException{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
		Class.forName("com.mysql.cj.jdbc.Driver");
	//	System.out.println("Connection sucessfully");
		
		return conn;
	}

}
