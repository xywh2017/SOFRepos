/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSP600;

public class UserBean {
      private String adminid;
      private String adminname;
      private String adminpassword;
      public boolean valid;
	 
      public String getAdminID() {
         return adminid;
	}

      public void setAdminID(String newAdminID) {
         adminid = newAdminID;
	}
      
      public String getAdminName() {
         return adminname;
			}

      public void setAdminName(String newAdminName) {
         adminname = newAdminName;
			}
      
      public String getAdminPassword() {
         return adminpassword;
	}

      public void setAdminPassword(String newAdminPassword) {
         adminpassword = newAdminPassword;
	}
				
      public boolean isValid() {
         return valid;
	}

      public void setValid(boolean newValid) {
         valid = newValid;
	}	
}