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
    <s:textfield label="提交商品" name="product"/>
    <s:submit value="提交"/>
</s:form>

</body>
</html>
