package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Gender;
import entity.Member;
import entity.MemberType;
import service.GenderService;
import service.GenderServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;
import service.MemberTypeService;
import service.MemberTypeServiceImpl;

@WebServlet("/MemberController")
public class MemberController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public MemberService ms;
	public GenderService gs;
	public MemberTypeService mts;
	
	
	public MemberController()
	{
		super();
		this.ms = new MemberServiceImpl();
		this.gs =new GenderServiceImpl();
		this.mts = new MemberTypeServiceImpl();
		
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8"); 
		
		Member member = new Member();
		member.setName(request.getParameter("txtname"));
		member.setFamily(request.getParameter("txtfamily"));
	
		
		int genderid=Integer.parseInt(request.getParameter("txtgender"));
		Gender gender=new Gender();
		
		gender=gs.getGender(genderid);
		member.setGender(gender);
		
		
		member.setTaghziyeno(request.getParameter("txttaghziyeno"));
		
		int memtypeid=Integer.parseInt(request.getParameter("txtmemtypeid"));
		MemberType type = new MemberType();
		type = mts.getMemberType(memtypeid);
		
		member.setMemtype(type);
		
		member.setMemberno(request.getParameter("txtmemberno"));
		member.setDetails(request.getParameter("txtdetails"));
		member.setStartdate(request.getParameter("txtstartdate"));
		member.setEnddate(request.getParameter("txtenddate"));
		
		try {
			ms.Add(member);
		} catch (Exception e) {
			e.printStackTrace();
		}  /// insert Member into DB
		
		
		request.getSession().setAttribute("AllMembers", ms.getAll());
		
		response.sendRedirect("InsertMember.jsp");
	}

	 protected void doGet(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException
	    {
			request.setCharacterEncoding("UTF-8"); 
			String action=request.getParameter("Action");
	
			if (action.equals("del"))
			{
				ms.Remove(Integer.parseInt(request.getParameter("id")));
				request.getSession().setAttribute("AllMembers", ms.getAll());		
				response.sendRedirect("InsertMember.jsp");
			}
	   }
}


