/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;
import static CSP600.LecturerDAO.currentCon;
import java.text.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author user
 */
public class AddLecturerDAO {
    
     static Connection currentCon = null;
    static ResultSet rs = null;

    public static LecturerBean addlecturer(LecturerBean Lbean) {
        
        System.out.println("JIJIJI");
        
        String lecturerID = Lbean.getLecturerID();
        String lecturerFullname = Lbean.getLecturerFullname();
        String lecturerPassword = Lbean.getLecturerPassword();
    
    try{  
            currentCon = JavaConnectionDB.getConnection();
            PreparedStatement ps=currentCon.prepareStatement("insert into lecturer (lecturerID,lecturerFullname,lecturerPassword) values (?,?,?)");  
            ps.setString(1,Lbean.getLecturerID());  
            ps.setString(2,Lbean.getLecturerFullname());  
            ps.setString(3,Lbean.getLecturerPassword());  
            ps.executeUpdate();  
            
            System.out.println("Your lecturer ID is " + lecturerID);
            System.out.println("Your lecturer is " + lecturerFullname);
            System.out.println("Your password is " + lecturerPassword);
            }
    catch(Exception e){
      System.out.println("Register failed: An Exception has occurred! " + e);
    }  
       

    
return Lbean;
}
}