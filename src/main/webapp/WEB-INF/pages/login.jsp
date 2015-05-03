<%--
  Created by IntelliJ IDEA.
  User: M ANIL KUMAR
  Date: 02-05-2015
  Time: AM 01:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/mt.css" />
</head>
<jsp:include page="header.jsp" />
<body>
  <div id="container">
    <div class="headingBorder">Login</div>
  </div>
  <form:form modelAttribute="user" method="post">
    <div id="loginFailedMsg">${loginFailedMsg}</div>
    <table align="center">
      <tr>
        <td>User Name:</td>
        <td><form:input path="userName" /></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><form:password path="password" /></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Login"></td>
      </tr>
    </table>
  </form:form>
</body>
</html>
