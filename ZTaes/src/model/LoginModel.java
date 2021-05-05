package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.DBConnect;

public class LoginModel extends DBConnect {
 
	private Boolean admin;
 
	public Boolean isAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
	
	public Boolean getCredentials(String username, String password){
           
           String query = "SELECT * FROM jpapa_users WHERE uname = ? and passwd = ?;";
            try(PreparedStatement stmt = connection.prepareStatement(query)) {
               stmt.setString(1, username);
               stmt.setString(2, password);
               ResultSet rs = stmt.executeQuery();
                if(rs.next()) { // go to first record
                	setAdmin(rs.getBoolean("admin"));
                	return true;
               	}
             }catch (SQLException e) {
            	e.printStackTrace();   
             }
	       return false;
    }

}//end class
