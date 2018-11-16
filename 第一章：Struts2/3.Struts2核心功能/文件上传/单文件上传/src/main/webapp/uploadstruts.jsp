<%--
  Created by IntelliJ IDEA.
  User: jimisun
  Date: 2018-11-15
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>commons fileupload 文件上传</title>
</head>
<body>

<s:form action="UploadAction" namespace="/" enctype="multipart/form-data">
    <s:file label="上传文件" name="upload"/>
    <s:textfield label="新文件名" name="filename"/>
    <s:submit value="上传"/>
</s:form>


</body>
</html>
