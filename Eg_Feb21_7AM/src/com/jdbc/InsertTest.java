package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eg_march7am", "root", "root");
		if(con != null)
			System.out.println("Connected with MySQL DB");
		else
			System.out.println("connection Failed...");
		
	/*	//String qry = "insert into Student values(105, 'Student5', 'addr5')";
		String qry = "delete from Student where id = 105";
		Statement st = con.createStatement();
		int i = st.executeUpdate(qry);*/
		                                                                            
		//String qry = "delete from Student where id = ?";
		String qry = "insert into Student values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(qry);
		pst.setInt(1, 106);
		pst.setString(2, "Student6");
		pst.setString(3, "addr6");
		int i = pst.executeUpdate();
        
		if(i != 0 )
			System.out.println("Student Data Inserted...");
		else
			System.out.println("Insertion Failed ... Contact Admin");

	}

}
