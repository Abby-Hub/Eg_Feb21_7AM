package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eg_march7am", "root", "root");
		if(con != null)
			System.out.println("Connected with MySQL DB");
		else
			System.out.println("connection Failed...");
		
		String qry = "Select * from Student";
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(qry);
		
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		for(int x = 1; x<=count ; x++)
		System.out.print(rsmd.getColumnName(x)+"\t");
		
		System.out.println();
		while (rs.next()) {
			System.out.println(rs.getInt("id")+"\t"+ rs.getString(2)+"\t"+rs.getString(3));
		}
		
		con.close();
		
	}

}
