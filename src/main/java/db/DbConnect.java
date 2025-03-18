package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
	
static Connection con =null;
public static Connection getConnection() throws SQLException, ClassNotFoundException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/course"+"user=myadimin&password=root6383994986");
	}catch(SQLException ex) {
		System.out.println("SQLException:"+ex.getMessage());
		System.out.println("SQLState:"+ex.getSQLState());
		System.out.println("VendorError:"+ex.getErrorCode());
	}
	return con;
	
}
}
