package com.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata101r";
		 String user="root";
		 String password="vinayraj@12345";
		 
//		 String query="insert into students values(102,'akhila',60,21)";
		 String query="update students set marks=100 where id=102";
		  try {
			  //stage-1
		Connection connection =DriverManager.getConnection(URL,user,password);
		 // stage -2
		 Statement st= connection.createStatement();
		 
		 //stage-3
		   int rows= st.executeUpdate(query);
		   System.out.println(rows +"inserted ...");
		   
		   
		   //stage-5
		   connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
