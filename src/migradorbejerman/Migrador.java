package migradorbejerman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Migrador {
	

	public static void main(String[] args) {
		Connection conn ;
		Statement st;
		try {
	        	System.out.println("Intenta...");
	            	conn = DriverManager.getConnection("jdbc:ucanaccess://d:/Factura.mdb;jackcessOpener=migradorbejerman.CryptCodecOpener", "", "5550690");
	            	st =conn.createStatement();
	            	ResultSet rs=st.executeQuery("SELECT * FROM FACTURAS");
	            	System.out.println("Parece que se conecta");
        
			} catch (SQLException ex) {
	            ex.printStackTrace();
	        }

	}

}
