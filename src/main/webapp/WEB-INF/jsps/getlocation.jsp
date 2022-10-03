<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h2>All Location</h2>
         <a href='test'>home</a>
      
         <table border='1' width='100%'>
            
            <tr>
               <th>Id</th>
               <th>Code</th>
               <th>Name</th>
               <th>Type</th>
                <th>Delete</th>
                 <th>Update</th>
            </tr>
       <c:forEach items="${location }" var="location">
         <%-- <c:out value="${location}"></c:out> --%>
           
            <tr>
               <th>${location.id}</th>
               <th>${location.code}</th>
               <th>${location.name}</th>
               <th>${location.type}</th>
               <td><a href="deleteLocation?id=${location.id}">Delete</a></td>
               <td><a href="updateTheLocation?Id=${location.id}">Update</a></td>
            </tr>
         </c:forEach>
         </table>
       
</body>
</html>