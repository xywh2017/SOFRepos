
package CSP600;
import static CSP600.LecturerDAO.currentCon;
import java.text.*;
import java.util.*;
import java.sql.*;
import static java.util.Collections.list;


public class SelectLecturerDAO {

    private List<LecturerBean> list;
    
   public List<LecturerBean> getLecturers() {
       
       System.out.println("11111");
       
     try{
         
         System.out.println("reewrwerw");
         
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="sys as sysdba";
        String password="sys";
        String query="select LecturerFullname from lecturer";
        Connection con=DriverManager.getConnection(url,username,password);
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(query);

        List<LecturerBean> list = new LinkedList<LecturerBean>();

        while(rs.next()) {
            
            System.out.println("Seqweqwe");
            
            String fullname= rs.getString("lecturerFullname");
            LecturerBean lec = new LecturerBean();
            lec.setLecturerFullname(fullname);
            rs.getString("lecturerFullname");
            list.add(lec);
        }
     } catch(Exception e) {
         
         System.out.println("Sikit lagi!!!");
     }
     return list;
   } 
   }    
    
    
    
    
    
//
//    static Connection currentCon = null;
//    static ResultSet rs = null;
//
//    public static LecturerBean selectlecturer(LecturerBean Lbean) {
//
//        // preparing some objects for connection
//        System.out.println("JIJIJI");
//        Statement stmt = null;
//
//       // String lecturerID = Lbean.getLecturerID();
//        String lecturerFullname = Lbean.getLecturerFullname();
//       // String lecturerPassword = Lbean.getLecturerPassword();
//       // Statement statement = con.createStatement() ;
//        
//     //   rs =statement.executeQuery("select lecturerfullname from lecturer");
//                                                                   
//        System.out.println("j444444");
//        
//        
//        String searchQuery = "select lecturerfullname from lecturer";
//        
//        // "System.out.println" prints in the console; Normally used to trace the process
//        //System.out.println("Your lecturer ID is " + lecturerID);
//        System.out.println("Your lecturer is " + lecturerFullname);
//        //System.out.println("Your password is " + lecturerPassword);
//        System.out.println("Query: " + searchQuery);
//
//        try {
//            // connect to DB
//            currentCon = JavaConnectionDB.getConnection();
//            stmt = currentCon.createStatement();
//            rs = stmt.executeQuery(searchQuery);
//           // boolean more = rs.next();
//            
//          //  List<LecturerBean> lecturers = new ArrayList<LecturerBean>();
//
//            while(rs.next())
//            {
//               // LecturerBean lecturer = new LecturerBean();
//               // lecturer.setLecturerFullname(
//               rs.getString("LecturerFullname");//);
//                //lecturer.add(lecturer);
//            }
//            
//
//         
//            // if user does not exist set the isValid variable to false
//           // if (!more) {
//         //       System.out.println("Sorry, you are not a registered user! Please sign up first");
//         //       Lbean.setValid(false);
//        //    }
//
//            // if user exists set the isValid variable to true
//        //    else if (more) {
//            //   String lecturerfullname = rs.getString("lecturerFullname");
//              // String lecturerpassword = rs.getString("lecturerPassword");
//
//           //     System.out.println("Welcome " + lecturerfullname);
//          //      Lbean.setLecturerFullname(lecturerfullname);
//              //  Lbean.setValid(true);
//         //   }
//        }
//
//        catch (Exception ex) {
//            System.out.println("Select failed: An Exception has occurred! " + ex);
//        }
//
//        // some exception handling
//        finally {
//            if (rs != null) {
//                try {
//                    rs.close();
//                } catch (Exception e) {
//                }
//                rs = null;
//            }
//
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (Exception e) {
//                }
//                stmt = null;
//            }
//
//            if (currentCon != null) {
//                try {
//                    currentCon.close();
//                } catch (Exception e) {
//                }
//
//                currentCon = null;
//            }
//        }
//
//        return Lbean;
//
//    }
//    

