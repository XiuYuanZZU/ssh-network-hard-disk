<%--
  Created by IntelliJ IDEA.
  User: 50360
  Date: 2018-11-16
  Time: 09:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<s:form action="register" method="get">
    <s:textfield label="用户名" name="username"/>
    <s:textfield label="密码" name="password"/>
    <s:textfield label="年龄" name="age"/>
    <s:textfield label="生日" name="birthday"/>
    <s:textfield label="曾住地1" name="address"/>
    <s:textfield label="曾住地2" name="address"/>
    <s:textfield label="曾住地3" name="address"/>
    <s:submit value="提交"/>
</s:form>

</body>
</html>
