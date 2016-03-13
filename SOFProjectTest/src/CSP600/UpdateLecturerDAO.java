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
public class UpdateLecturerDAO {
    
     static Connection currentCon = null;
    static ResultSet rs = null;

    public static LecturerBean updatelecturer(LecturerBean Lbean) {
        
        System.out.println("JIJIJI");
        
        String lecturerID = Lbean.getLecturerID();
        String lecturerFullname = Lbean.getLecturerFullname();
        String lecturerPassword = Lbean.getLecturerPassword();
    
    try{  
            currentCon = JavaConnectionDB.getConnection();
            PreparedStatement ps=currentCon.prepareStatement("UPDATE lecturer set lecturerFullname=?, lecturerPassword=?  WHERE lecturerID=?");  
            ps.setString(1,Lbean.getLecturerFullname());  
            ps.setString(2,Lbean.getLecturerPassword());  
            ps.setString(3,Lbean.getLecturerID());  
            ps.execute();  
            
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