<%@page import="service.GenderServiceImpl"%>
<%@page import="service.GenderService"%>
<%@page import="service.MemberTypeService"%>
<%@page import="service.MemberTypeServiceImpl"%>
<%@page import="service.MemberService"%>

<%@page import="entity.Gender"%>
<%@page import="entity.MemberType"%>
<%@page import="entity.Member"%>


<%@page import="javax.sql.CommonDataSource"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ثبت اعضا</title>
</head>
<body >
<h1 align="center" > فرم ثبت  عضو جدید</h1>



<%	List<Gender> gen=new ArrayList<Gender>();
	GenderService gs = new GenderServiceImpl();
	gen = gs.getAll();
	
	List<MemberType> mt=new ArrayList<MemberType>();
	MemberTypeService mts = new MemberTypeServiceImpl();
	mt = mts.getAll();
%>

<form action="MemberController" method="post">
<table align="right">
    
	<tr>
		<td> <input type="text" name="txtname"> </td>
		<td>نام </td> 
		
	</tr>
	<tr>
		<td><input type="text" name="txtfamily"> </td>
		<td>نام خانوادگی </td> 
	</tr>
	<tr>
			<td><select name="txtgender">
			<%for(Gender  g: gen){ %>
			<option value="<%=g.getId()%>"><%= g.getGendertitle() %></option>
			<% } %>
			</select>
			</td>
			<td>جنسیت</td>
	</tr>
	<tr>
		<td> <input type="text" name="txttaghziyeno"> </td>
		<td>شماره تغذیه </td> 
	</tr>
	<tr>
			<td><select name="txtmemtypeid">
			<%for(MemberType  mp: mt){ %>
			<option value="<%=mp.getId()%>"><%= mp.getTypeName() %></option>
			<% } %>
			</select>
			</td>
			<td>نوع عضو</td>
	</tr>
	<tr>
		<td> <input type="text" name="txtmemberno"> </td>
		<td>شماره پرسنلی/دانشجویی </td> 
	</tr>
	<tr>
		<td> <input type="text" name="txtdetails"> </td>
		<td>توضیحات </td> 
	</tr>
	<tr>
		<td> <input type="text" name="txtstartdate"> </td>
		<td>تاریخ شروع اعتبار </td> 
	</tr>
	<tr>
		<td> <input type="text" name="txtenddate"> </td>
		<td>تاریخ پایان اعتبار </td> 
	</tr>
	
	<tr>
		 <td align="center" colspan="2"><input type="submit" value="ثبت عضو جدید"></td>
	 </tr>
</table>
		
</form>


<% 
Object Result=request.getSession().getAttribute("AllMembers");
if (Result!=null)
{
	List<Member> AllMembers=(ArrayList<Member>) Result; 
%>		
<br><br>
<table align="right" bgcolor="#EEEEEE" border="1">
	<tr bgcolor="#CCCCCC">
		<td> نام</td>
		<td> نام خانوادگی</td>
		<td> جنسیت</td>
		<td> شماره تغذیه</td>
		<td> نوع عضو</td>
		<td> شماره پرسنلی/دانشجویی</td>
		<td> توضیحات</td>
		<td> تاریخ شروع اعتبار</td>
		<td> تاریخ پایان اعتبار</td>
		<td> حذف</td>
				
	</tr>

<% 
	for (Member m:AllMembers)
	{
%>
	<tr>
		<td> <%=m.getName() %></td>
		<td> <%=m.getFamily() %></td>
		<td> <%=m.getGender().getGendertitle() %></td>
		<td> <%=m.getTaghziyeno() %></td>
		<td> <%=m.getMemtype().getTypeName() %></td>
		<td> <%=m.getMemberno() %></td>
		<td> <%=m.getDetails() %></td>
		<td> <%=m.getStartdate() %></td>
		<td> <%=m.getEnddate() %></td>
		<td> <a href="MemberController?Action=del&id=<%=m.getId()%>">حذف</a></td>
		
	</tr>
	
<%	
	}//end of For
%>
</table>

<%
}// end of IF Result!=null
%> 
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<h4 align="left">Programmed by Mostafa Anbarmoo, All righted Reserved!.</h4>

</body>
</html>