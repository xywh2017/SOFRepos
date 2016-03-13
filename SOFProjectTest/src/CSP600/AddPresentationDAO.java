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
public class AddPresentationDAO {
    static Connection currentCon = null;
    static ResultSet rs = null;

    public static PresentationBean addpresentation(PresentationBean PBean){
        System.out.println("JIJIJI");
        
       
        int presentationID = PBean.getPresentationID();
        String presentationDay = PBean.getPresentationDay();
        String presentationStart = PBean.getPresentationStart();
        String presentationEnd = PBean.getPresentationEnd();
  
    
    try{  
            currentCon = JavaConnectionDB.getConnection();
            
            PreparedStatement ps=currentCon.prepareStatement("insert into presentation (presentationID,presentationDay,presentationStart,presentationEnd) values (presentationseq.nextval,?,?,?)"); 
            
            ps.setString(1,PBean.getPresentationDay());  
            ps.setString(2,PBean.getPresentationStart());  
            ps.setString(3,PBean.getPresentationEnd()); 
            //ps.setInt(4,PBean.getPresentationID()); 
            ps.addBatch(); 
            
           // int[] result=ps.executeBatch();
            
            //System.out.println("no of rows"+ result.length);
            
           // System.out.println("Your presentation ID is " + presentationID);
            System.out.println("Your day is " + presentationDay);
            System.out.println("Your start is " + presentationStart);
            System.out.println("Your end is " + presentationEnd);
            }
    catch(Exception e){
      System.out.println("Add presentation failed: An Exception has occurred! " + e);
    }  
       

    
return PBean;
}
    
}
