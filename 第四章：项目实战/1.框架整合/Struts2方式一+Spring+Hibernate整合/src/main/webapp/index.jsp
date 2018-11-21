<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>


<div>
    <h3> 增加用户</h3><br>
    <div>
        <s:form action="addUser.action" method="GET">
            <s:textfield label="用户名" name="username"/>
            <s:textfield label="密码" name="password"/>
            <s:submit value="增加"/>
        </s:form>
    </div>

    <br>
    <h3> 查询用户</h3><br>
    <s:form action="getUser.action" method="GET">
        <s:textfield label="id" name="id"/>
        <s:submit value="查询"/>
    </s:form>
    <s:property value="user.username"/><br>
    <s:property value="user.password"/>
</div>
</body>
</html>
