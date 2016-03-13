/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class DeletePresentationDAO {
     static Connection currentCon = null;
    static ResultSet rs = null;

    public static PresentationBean deletepresentation(PresentationBean PBean) {
        
        System.out.println("uuuuuuu");
        
        int presentationID = PBean.getPresentationID();

    try{  
            currentCon = JavaConnectionDB.getConnection();
            PreparedStatement ps=currentCon.prepareStatement("delete from presentation where presentationID=?");  
            ps.setInt(1,PBean.getPresentationID());  
            ps.executeUpdate();  
            
            
            System.out.println("Your presentation id is " + presentationID);
           
            }
    catch(Exception e){
      System.out.println("Deletion failed: An Exception has occurred! " + e);
    }  
       

    
return PBean;
}
    
}
