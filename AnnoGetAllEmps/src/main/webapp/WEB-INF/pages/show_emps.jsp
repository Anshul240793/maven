<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   
    <c:choose>
     <c:when test="${!empty listEmpDTO }">
     <table align="center" border="1" bgcolor="cyan">
       <tr bordercolor="red">
       <th>Employee Sr No</th>
       <th>Employee Id</th>
       <th>Employee Name</th>
       <th>Employee Designation</th>
       <th>Employee Salery</th>
       <th>Employee Deptno</th>
       </tr>
      <c:forEach var="emp" items="${ listEmpDTO}">
       <tr bgcolor="blue">
       <td>${emp.empSrno}</td>
       <td>${emp.empId}</td>
       <td>${emp.empName}</td>
       <td>${emp.empJob}</td>
       <td>${emp.empSal}</td>
       <td>${emp.deptno}</td>
       </tr>
      </c:forEach>
     </table>
    </c:when>
    <c:otherwise>
     <h1 style="color: red;text-align: center">Records Not Found</h1>
    </c:otherwise>
    </c:choose>
    <br><br>
    <a href="home.htm">Home</a>