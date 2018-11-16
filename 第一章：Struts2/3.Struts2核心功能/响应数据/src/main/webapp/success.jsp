<%--
  Created by IntelliJ IDEA.
  User: 50360
  Date: 2018-11-16
  Time: 09:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--从Servlet API的Request域对象中取值--%>
Request取值:<s:property value="#request.requestValue"/>
<br>
<%--值栈Set方法取值--%>
值栈set取值:<s:property value="valueStackDemo"/>

<br>

<%--值栈Push方法取值--%>
值栈push取值:<s:property value="[0].top"/>

<br>

<%--获取属性值--%>
简单属性取值:<s:property value="user.username"/>

<br>
<%--获取属性List值--%>
list属性取值:
<br>
<s:iterator value="list" var="user">

    <s:property value="#user.username"/>
    <s:property value="#user.password"/>
    <br/>
</s:iterator>


<s:debug/>

</body>
</html>
