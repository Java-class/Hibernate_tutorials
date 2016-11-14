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


<form action="FoodController" method="get">
<input type="hidden" name="Action" value="edit2">
<input type="hidden" name="id" value=<%=request.getParameter("id") %>>
<table >
    <tr>
		<td>edit Food Number: </td> 
		<td> <input type="text" name="id2" value=<%=request.getParameter("id") %>> </td>
	</tr>
	<tr>
		<td>edit Name: </td> 
		<td> <input type="text" name="name2" value=<%=request.getParameter("name") %>> </td>
	</tr>
	
	<tr>
		<td>edit BasePrice: </td> 
		<td> <input type="text" name="base2" value=<%=request.getParameter("base") %>> </td>
	</tr>
	
	 <tr>
		 <td align="center" colspan="2"><input type="submit" value="بروز رسانی"></td>
	 </tr>
	 </table>	
</form>
<a href="InsertFood.jsp">بازگشت به صفحه قبلی</a>
<br><br><br><br><br><br><br><br>
<h4 align="left">Programmed by Mostafa Anbarmoo, All righted Reserved!.</h4>

</body>
</html>