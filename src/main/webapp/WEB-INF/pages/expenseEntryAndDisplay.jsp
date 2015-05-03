<%--
  Created by IntelliJ IDEA.
  User: M ANIL KUMAR
  Date: 02-05-2015
  Time: PM 05:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Expense Entry Page</title>
    <link href="css/mt.css" rel="stylesheet" type="text/css">
</head>
<jsp:include page="expenseEntryAndDisplay.jsp"/>
<body>
  <div id="container">

    <form:form modelAttribute="dailyExpense">
      <table>
        <tr>
          <td>Expense Name:</td>
          <td>
            <form:input path="expenseName" />
          </td>
        </tr>
        <tr>
          <td>
          </td>
          <td>
            <form:input path="expenseCategory" />
          </td>
        </tr>
        <tr>
          <td>
            Expense Date:
          </td>
          <td>
            <form:input path="expenseDate" />
          </td>
        </tr>
        <tr>
          <td>
            Expense Amount:
          </td>
          <td>
            <form:input path="expenseAmount" />
          </td>
        </tr>
        <tr>
          <td>
            Expense Location:
          </td>
          <td>
            <form:input path="expenseLocation" />
          </td>
        </tr>
        <tr>
          <td>
            Expense Note:
          </td>
          <td>
            <form:input path="expenseNote" />
          </td>
        </tr>
        <tr>
          <td></td>
          <td colspan="2">
            <input type="submit" value="Add Expense" />
          </td>
        </tr>
      </table>
    </form:form>
  </div>
</body>
</html>
