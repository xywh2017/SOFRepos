/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;
import java.text.*;
import java.util.*;
import java.sql.*;

public class UserDAO {
    static Connection currentCon = null;
    static ResultSet rs = null;

    public static UserBean login(UserBean bean) {

        // preparing some objects for connection
        System.out.println("JIJIJI");
        Statement stmt = null;

        String adminid = bean.getAdminID();
        String adminname=bean.getAdminName();
        String adminpassword = bean.getAdminPassword();

        String searchQuery = "select * from admin where adminid='" + adminid + "' AND adminpassword='" + adminpassword + "'";

        // "System.out.println" prints in the console; Normally used to trace the process
        System.out.println("Your admin is " + adminid);
        System.out.println("Your admin name is "+ adminname);
        System.out.println("Your password is " + adminpassword);
        System.out.println("Query: " + searchQuery);

        try {
            // connect to DB
            currentCon = JavaConnectionDB.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
            boolean more = rs.next();

            // if user does not exist set the isValid variable to false
            if (!more) {
                System.out.println("Sorry, you are not a registered user! Please sign up first");
                bean.setValid(false);
            }

            // if user exists set the isValid variable to true
            else if (more) {
                String adminName = rs.getString("Adminname");
                String adminPassword = rs.getString("adminPassword");

                System.out.println("Welcome " + adminName);
                bean.setAdminName(adminName);
                   bean.setAdminPassword (adminPassword);
                bean.setValid(true);
            }
        }

        catch (Exception ex) {
            System.out.println("Log In failed: An Exception has occurred! " + ex);
        }

        // some exception handling
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                }
                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
                stmt = null;
            }

            if (currentCon != null) {
                try {
                    currentCon.close();
                } catch (Exception e) {
                }

                currentCon = null;
            }
        }

        return bean;

    }
}
