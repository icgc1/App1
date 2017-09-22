<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Application</title>
</head>
<body>
<h1> Employee Details</h1>

<!--  <form action="LoginController" method="post">-->

<form action="Add.jsp" >
<input type="submit" name="add"  value="Add">
</form>

<form action="update.jsp" >
<input type="submit" name="update" value="Update">
</form>

<form action="Delete.jsp" >
<input type="submit" name="delete"  value="Delete">
</form>
  
  <form action="Display.jsp" >
<input type="submit" name="display"  value="Display">
</form>
</body>

</html>