<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/19
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
  <p>shit test</p>
  <form action="portal" method="post">
    <div><b>Please enter your accout imformation</b>
      <table>
        <tr>
          <td>your accout:</td>
          <td><input type="text" name="user"></td>
        </tr>
        <tr>
          <td>your password:</td>
          <td><input type="password" name="password"></td>
        </tr>
      </table>
    <input type="submit" value="Login">
    </div>

  </form>
  <p>sessionID:<%= request.getSession().getId()%></p>
  </body>
</html>
