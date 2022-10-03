<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <h2>Update location</h2>
      <form action="getlocation" method="post">
        id<input type="text" name="id" value="${id}" />
         Code<input type="text" name="code" value="${code}" />
         Name<input type="text" name="name" value="${name}" />
         Type:Urban<input type="radio" name="type" value="${urban}" />
         Rural<input type="radio" name="type" value="${rural}" />
         <input type="submit" value="Update" />
               
      </form>  

</body>
</html>