<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table class="table table-striped" border="1px">

<thead>
  		<tr>
  		<th>Product ID</th>
  			<th>ProductName</th>
			<th>SubTotal</th>
			<th>Image</th>
			<th>Operation</th>
			
			
			</tr>
			</thead>
			<tbody>
			<c:forEach var="list1" items="${cart1}">
                <tr>
                <td><c:out value="${list1.productId}"/></td>
                 <td><c:out value="${list1.productName}" /></td>
                  <td><c:out value="${list1.productPrice*list1.avail}" /></td>
                  <td style="width:171px;"><img src="${pageContext.request.contextPath}/pics/${list1.productId}.jpg" style="width:100px; height:90px;"/></td>
                  <td><form>
                  <button  class="btn btn-info btn-lg" name = "ProductId" value = "${list1.productId}" type = "submit" formmethod="post" formaction="/textile_app/delete1"> <span class="glyphicon glyphicon-trash">Remove</span></button></form></td>
                </tr>
            </c:forEach>
            </tbody>
            </table>
</body>
</html>