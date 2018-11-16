<%--
  Created by IntelliJ IDEA.
  User: 50360
  Date: 2018-11-16
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>error</title>
</head>
<body>

<b>异常消息</b><br>
<font color="red"><s:property value="exception.message"/> </font><br><br>


<b>异常栈信息</b><br>
<font color="red"><s:property value="exceptionStack"/> </font><br><br>
</body>
</html>
