<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update data</title>
</head>
<body>
<h3> Updating Employee data </h3>
<form action="UpdateController" method="post">

Employee Id:<input type="text"  name="eid"><br>


Employee Salary:<input type="text"  name="esal"><br>


<input type="submit"  value="Update">
</form>

</body>
</html>