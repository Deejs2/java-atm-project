/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prabhubank;
import java.sql.*;
/**
 *
 * @author Annoy
 */
public class PrabhuBank {

    
    //Global variables
	static Connection conn;
	static Statement stmt;
	String customerName;
	String cardNumber;
	int PIN;
	double balance;
	boolean status;
        
        public PrabhuBank() throws ClassNotFoundException,SQLException{
		DbConnection dbc = new DbConnection();
		conn = dbc.getConnection();
		stmt = conn.createStatement(); 	
		
		String sql = "SELECT * FROM `customer`";
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next()){
			customerName = rs.getString("name");
			cardNumber = rs.getString("cardNumber");
			PIN = rs.getInt("pin");	
			status = rs.getBoolean("status");
			balance =rs.getDouble("balance");
		}
    }
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        // TODO code application logic here
//        CardNumberValidationJFrame cnvjf = new CardNumberValidationJFrame();
//        cnvjf.setVisible(true);
    PrabhuBank pb = new PrabhuBank();
        if(pb.status){
            UserValidation uv = new UserValidation();
            uv.setVisible(true);
        }else{
            UserValidation uv = new UserValidation();
            uv.setVisible(true);
        }
    }
    
}
