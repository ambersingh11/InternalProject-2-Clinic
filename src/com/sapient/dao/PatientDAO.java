package com.sapient.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sapient.actors.Employee;
import com.sapient.actors.Patient;
import com.sapient.utils.SqlConnection;

public class PatientDAO {
private Connection con;
	
	public PatientDAO() {
		super();
		con=SqlConnection.getOracleConnection();
	}

	public Patient find(String patientCode){
		Patient emp=null;
		String query="select * from CLINICPATIENTS where PATIENTCODE=?";
		try{
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,patientCode);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				emp=new Patient(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getLong(4),rs.getString(5),rs.getString(6));
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return emp;
	}
}
