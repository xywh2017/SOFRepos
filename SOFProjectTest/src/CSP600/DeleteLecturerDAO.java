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
public class DeleteLecturerDAO {
    
     static Connection currentCon = null;
    static ResultSet rs = null;

    public static LecturerBean deletelecturer(LecturerBean Lbean) {
        
        System.out.println("uuuuuuu");
        
        String lecturerFullname = Lbean.getLecturerFullname();
       
        
        
    
    try{  
            currentCon = JavaConnectionDB.getConnection();
            PreparedStatement ps=currentCon.prepareStatement("delete from lecturer where lecturerFullname=?");  
            ps.setString(1,Lbean.getLecturerFullname());  
            ps.executeUpdate();  
            
            
            System.out.println("Your lecturer is " + lecturerFullname);
           
            }
    catch(Exception e){
      System.out.println("Deletion failed: An Exception has occurred! " + e);
    }  
       

    
return Lbean;
}
}
