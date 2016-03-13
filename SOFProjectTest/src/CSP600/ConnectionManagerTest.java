/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import org.junit.Test;

public class ConnectionManagerTest {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_USER = "sys";
	private static final String DB_PASSWORD = "sys";

	//@Test
	public void testGetConnection() {
		Connection con = null;

		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
//			con = DriverManager.getConnection(DB_CONNECTION, DB_USER,
//					DB_PASSWORD);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys","sys");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	//@Test
	public void testGetDBConnection() {
		Connection dbConnection = null;
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());

		}
		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
					DB_PASSWORD);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
