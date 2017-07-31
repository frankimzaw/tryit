<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/26
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" scope="session" class="userbean.userbean"/>
<html>
<head>
    <title>imformation</title>
</head>
<body>
<p>Congratulation</p>
<ul>
    <li>
        name:<jsp:getProperty name="user" property="name"/>
    </li>
    <li>
        sex:<jsp:getProperty name="user" property="sex"/>
    </li>
    <li>
        age:<jsp:getProperty name="user" property="age"/>
    </li>
</ul>
,

</body>
</html>
