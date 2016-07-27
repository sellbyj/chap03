<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request.jsp</title>
</head>
<body>
<h1>today: <%= new Date() %></h1>

id = <%=request.getParameter("id") %>
pw = <%=request.getParameter("pw") %>
phone = <%=request.getParameter("phone") %>
age = <%=request.getParameter("age") %>
sex = <%=request.getParameter("sex") %>
job = <%=request.getParameter("job") %>

</body>
</html>