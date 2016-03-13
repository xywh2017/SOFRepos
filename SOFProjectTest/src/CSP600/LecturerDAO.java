/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

import java.text.*;
import java.util.*;
import java.sql.*;


/**
 *
 * @author user
 */
public class LecturerDAO {
    static Connection currentCon = null;
    static ResultSet rs = null;

    public static LecturerBean lecturerlogin(LecturerBean Lbean) {

        // preparing some objects for connection
        System.out.println("JIJIJI");
        Statement stmt = null;

        String lecturerID = Lbean.getLecturerID();
        String lecturerFullname = Lbean.getLecturerFullname();
        String lecturerPassword = Lbean.getLecturerPassword();
        
        
        String searchQuery = "select * from lecturer where lecturerID='" + lecturerID + "' AND lecturerpassword='" + lecturerPassword + "'";
        
        // "System.out.println" prints in the console; Normally used to trace the process
        System.out.println("Your lecturer ID is " + lecturerID);
        System.out.println("Your lecturer is " + lecturerFullname);
        System.out.println("Your password is " + lecturerPassword);
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
                Lbean.setValid(false);
            }

            // if user exists set the isValid variable to true
            else if (more) {
               String lecturerfullname = rs.getString("lecturerFullname");
              // String lecturerpassword = rs.getString("lecturerPassword");

                System.out.println("Welcome " + lecturerfullname);
                Lbean.setLecturerFullname(lecturerfullname);
                Lbean.setValid(true);
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

        return Lbean;

    }
    
}
