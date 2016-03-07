package com.sapient.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sapient.actors.Employee;
import com.sapient.dao.EmployeeDAO;

/**
 * Servlet implementation class Validate
 */
public class EmpValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp=null;
		response.setContentType("application/json");
		//response.setHeader("Cache-Control", "no-cache");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("userName");
		int empCode=0;
		try{
		empCode=Integer.parseInt(request.getParameter("empCode"));
		}
		catch(Exception ex){}
		EmployeeDAO dao=new EmployeeDAO();
		
		if(userName!=null)
			emp=dao.find(userName);
		else
			emp=dao.find(empCode);
		if(emp!=null){
			String jsonEmp=new Gson().toJson(emp);
			System.out.println(jsonEmp);
			out.write(jsonEmp);
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
