<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add page</title>
</head>
<body>
<h3> Adding Employee data </h3>
<form action="AddController" method="post">

Employee Id:<input type="text"  name="eid"><br>
Employee Name:<input type="text"  name="ename"><br>
Employee Salary:<input type="text"  name="esal"><br>
Employee Address:<input type="text"  name="eaddr"><br>
<input type="submit"  value="Add">
</form>

</body>
</html>