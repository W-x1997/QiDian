<%--
  Created by IntelliJ IDEA.
  User: wx
  Date: 2019/1/8
  Time: 上午10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Welcome to NJUT!</h1>


  <form action="register" method="get">
    用户名<input type="text" value="" name="uaccount"/>
    <br />
    密码<input type="password" value="" name="upwd"/>
    <br />
    昵称 <input type="text" value="" name="nickname"/>
    <br />

    <input type="submit" value="提交">



  </form>

  <input type="button" value="注册">
  <input type="button" value="登陆">

  </body>
</html>
