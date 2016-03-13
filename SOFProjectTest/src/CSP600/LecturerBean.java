/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

public class LecturerBean {

      private String lecturerID;
      private String lecturerFullname;
      private String lecturerPassword;
      public boolean valid;
	 
      public String getLecturerID() {
         return lecturerID;
	}

    public void setLecturerID(String newLecturerID) {
         lecturerID = newLecturerID;
	}
	
			
    public String getLecturerFullname() {
         return lecturerFullname;
			}

    public void setLecturerFullname(String newLecturerFullname) {
         lecturerFullname = newLecturerFullname;
    }	
      
     public String getLecturerPassword() {
         return lecturerPassword;
			}

      public void setLecturerPassword(String newLecturerPassword) {
         lecturerPassword = newLecturerPassword;
			}
	
      public boolean isValid() {
         return valid;
	}

      public void setValid(boolean newValid) {
         valid = newValid;
	}	

    void add(LecturerBean lecturer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}