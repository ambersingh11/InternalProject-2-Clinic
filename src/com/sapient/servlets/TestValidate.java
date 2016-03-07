package com.sapient.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sapient.actors.Employee;
import com.sapient.actors.Patient;
import com.sapient.dao.EmployeeDAO;
import com.sapient.dao.PatientDAO;

/**
 * Servlet implementation class TestValidate
 */
public class TestValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		//response.setHeader("Cache-Control", "no-cache");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		String patientCode=request.getParameter("patientCode");
		System.out.println(patientCode);
		PatientDAO dao=new PatientDAO();
		Patient pat=dao.find(patientCode);
		if(pat!=null){
			String jsonPat=new Gson().toJson(pat);
			System.out.println(jsonPat);
			out.write(jsonPat);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
