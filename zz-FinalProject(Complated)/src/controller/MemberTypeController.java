package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.MemberType;
import service.MemberTypeService;
import service.MemberTypeServiceImpl;


@WebServlet("/MemberTypeController")
public class MemberTypeController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public MemberTypeService mts;
	
	public MemberTypeController()
	{
		super();
		mts = new MemberTypeServiceImpl();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8"); 
		
		MemberType type = new MemberType();
		type.setTypeName(request.getParameter("txtname"));
		type.setDetails(request.getParameter("txtdetails"));
		
		try {
			mts.Add(type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /// insert MemberType into DB
		
		request.getSession().setAttribute("AllMemTypes", mts.getAll());
		
		response.sendRedirect("InsertMemberType.jsp");
	}
}
