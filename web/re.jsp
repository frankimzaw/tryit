<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/26
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" scope="session" class="userbean.userbean">
    <jsp:setProperty name="user" property="*"/>
</jsp:useBean>
<p>congratulation:</p>
