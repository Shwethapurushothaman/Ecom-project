<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<h1>List of Items</h1>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="15%">Product ID</th>
<th width="15%">Product Name</th>
<th width="10%">Product Avail</th>
<th width="10%">Product Prize</th>
<th width="10%">Product Description</th>
<th width="10%">Image</th>
<th width="10%">Action</th>
</tr>
</thead>
<tbody>
<c:forEach var="list" items="${lists}">
<tr>
    <td><c:out value="${list.pid}"/></td>
    <td><c:out value="${list.pname}"/></td>
    <td><c:out value="${list.avail}"/></td>
    <td><c:out value="${list.pprice}"/></td>
    <td><c:out value="${list.pdesc}"/></td>
    <td>
    <img src="${pageContext.request.contextPath}/pics/${list.pid}.png" height="200" width="200"></td>
    <td>
    <form method="get" action="cart/${list.pid}">
  <button type="submit"  class="link-button">
Add to Cart
  </button>
 </form>
    </td>
    </tr>
</c:forEach>
</tbody>
</table>

