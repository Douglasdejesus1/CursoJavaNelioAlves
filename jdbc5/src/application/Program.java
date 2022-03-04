package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrytyException;

public class Program {

	public static void main(String[] args) {
		 
		Connection conn=null;
		PreparedStatement st = null;
		
		try {
			conn =DB.getConnection();
			
			st = conn.prepareStatement(
			
					"DELETE FROM department "
					+"WHERE "
					+"iD = ?");
			st.setInt(1, 2);
					
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Done! Rows affected: "+ rowsAffected);					
		}
		catch(SQLException e) {
			//e.printStackTrace();
			throw new DbIntegrytyException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();	
		}
		}
	}