/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;
import java.sql.*;
import java.util.*;


public class JavaConnectionDB {

    static Connection con;

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_USER = "sys as sysdba";
	private static final String DB_PASSWORD = "sys";
	
    public static Connection getConnection() {

        try {
            System.out.println("connected222");

            Class.forName(DB_DRIVER);
            System.out.println("connected333");

            try {
                con = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
                System.out.println("connected");

            }

            catch (SQLException ex) {
                 System.out.println("connect4444");
                ex.printStackTrace();
            }
        }

        catch (ClassNotFoundException e) {
             System.out.println("connect55555");
            System.out.println(e);
        }

        return con;
    }
}

   