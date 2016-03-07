package com.sapient.dao;

import java.sql.*;

import com.sapient.actors.Employee;
import com.sapient.utils.SqlConnection;

public class EmployeeDAO {
	private Connection con;
	
	public EmployeeDAO() {
		super();
		con=SqlConnection.getOracleConnection();
	}

	public Employee find(String userName){
		Employee emp=null;
		String query="select * from CLINICEMP where USERNAME=?";
		try{
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,userName);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return emp;
	}
	public Employee find(int empCode){
		Employee emp=null;
		String query="select * from CLINICEMP where EMPID=?";
		try{
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1,empCode);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				emp=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return emp;
	}
}
