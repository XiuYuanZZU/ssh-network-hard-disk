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
<s:fielderror/>
<s:form action="UploadAction" namespace="/" enctype="multipart/form-data">
   <span id="files">
       <input type="file" name="upload"/>
       <p/>
         <input type="file" name="upload"/>
       <p/>


   </span>
    <input type="submit" value="上传" style="width: 50px">
</s:form>


</body>
</html>
