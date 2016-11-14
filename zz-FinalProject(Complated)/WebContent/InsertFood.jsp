<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Food" %>
<%@ page import="controller.FoodController" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ثبت غذا</title>
</head>
<body>
<h1 align="center" > فرم ثبت غذا جدید</h1>

<form action="FoodController" method="post">
<table align="right">
    
	<tr>
		<td> <input type="text" name="txtname"> </td>
		<td>نام غذا </td> 
	</tr>
	
	<tr>
		<td> <input type="text" name="txtbaseprice"> </td>
		<td>قیمت پایه</td> 
	</tr>
	
	 <tr>
		 <td align="center" colspan="2"><input type="submit" value="ثبت غذای جدید"></td>
	 </tr>
	 </table>
	
</form>


<% 
Object Result=request.getSession().getAttribute("AllFoods");
if (Result!=null)
{
	List<Food> AllFoods=(ArrayList<Food>)Result; 
%>		
<br><br>
<table align="center" bgcolor="#EEEEEE" border="1">
	<tr bgcolor="#CCCCCC">
		<td> کد</td>
		<td> نام غذا</td>
		<td> قیمت غذا</td>
		<td>حذف</td>
		<td>ویرایش</td>
		
		
	</tr>
 
<%	
	for (Food m:AllFoods)
	{
%>	<tr>
		<td> <%=m.getId() %></td>
		<td> <%=m.getFoodname() %>  </td>
		<td> <%=m.getBaseprice() %>  </td>
		<td> <a href="FoodController?Action=del&id=<%=m.getId()%>">حذف</a></td>
		<td><a href="FoodController?Action=edit&id=<%=m.getId()%>&name=<%=m.getFoodname()%>&base=<%=m.getBaseprice()%>">ویرایش</a></td>		
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