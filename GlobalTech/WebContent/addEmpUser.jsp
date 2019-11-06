<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form method="post" action="http://localhost:7070/GlobalTech/AddEmpController">
Enter Employee ID: <input type="number" name="eid" width="100px">
<br><br>

Enter First Name: <input type="text" name="fname" width="100px">
<br><br>

Enter Last Name: <input type="text" name="lname" width="100px">
<br><br>


Enter Date of Joining: <input type="text" name="doj" width="100px">
<br><br>

Enter Employee Department: <input type="text" name="dept" width="100px">
<br><br>


<input type="submit" value ="Add Employee" width="100px">
<br><br>
</form>
</center>





</body>
</html>