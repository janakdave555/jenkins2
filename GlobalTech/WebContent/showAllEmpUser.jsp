<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,gte.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	ArrayList<EmpUser> list=(ArrayList)session.getAttribute("userList");

if(list.isEmpty())
{
	
%>
No records found
<% 
}
else
{
%>
<table border="1px">
	<tr>
		<th>Eid</th>
		<th>Fname</th>
		<th>Lname</th>
		 <th>DOJ</th> 
		<th>Dept</th>
	</tr>
	
<%
	for(EmpUser empu:list)
	{
%>
<tr>
		<td><%= empu.getEid() %></td>
		<td><%= empu.getFname() %></td>
		<td><%= empu.getLname() %></td>
		<td><%= empu.getDoj() %></td>
		<td><%= empu.getDept() %></td>
</tr>

<% 
	}
%>
	
</table>
<%
}
%>

</body>
</html>