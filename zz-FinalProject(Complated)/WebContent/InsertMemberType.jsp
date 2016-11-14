<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.MemberType" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ثبت نوع عضو</title>
</head>
<body>
<h1 align="center" > فرم ثبت نوع عضو جدید</h1>

<br>
<br>
<form action="MemberTypeController" method="post">
<table align="right">
 
	<tr>
		
		<td> <input type="text" name="txtname"> </td>
		<td>نام نوع عضو </td> 
	</tr>
	<tr>
		 
		<td> <input type="text" name="txtdetails"> </td>
		<td>توضیحات </td>
	</tr>
	
	
	<tr>
		 <td align="center" colspan="2"><input type="submit" value="ثبت نوع عضو جدید"></td>
	 </tr>
	 </table>

	
</form>





<% 
Object Result=request.getSession().getAttribute("AllMemTypes");
	if(Result!=null){
	List<MemberType> AllMemTypes=(ArrayList<MemberType>)Result; 
%>		
<br><br>
<table bgcolor="#EEEEEE" border="1">

	<tr bgcolor="#CCCCCC">
		<td> کد</td>
		<td> نام</td>
		<td> توضیحات</td>
		
		
	</tr>

<% 
	for (MemberType m:AllMemTypes)
	{
%>
	<tr>
		<td> <%=m.getId() %></td>
		<td> <%=m.getTypeName() %>  </td>
		<td> <%=m.getDetails() %>  </td>
		
	</tr>
<%	
	}//end of For
%>

</table>

 <%
}// end of IF Result!=null
%> 
<br><br><br><br><br><br><br><br>
<h4 align="left">Programmed by Mostafa Anbarmoo, All righted Reserved!.</h4>

</body>
</html>