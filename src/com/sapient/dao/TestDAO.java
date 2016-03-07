package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.sapient.actors.Test;
import com.sapient.utils.SqlConnection;

public class TestDAO {
	private Connection con;
	public TestDAO() {
		super();
		con=SqlConnection.getOracleConnection();
	}
	public Test find(int testCode){
		Test test=null;
		String query="select * from CLINICTEST where TESTCODE=?";
		try{
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1,testCode);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				test=new Test(rs.getInt(1),rs.getString(2),rs.getFloat(3));
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return test;
	}
	
}
