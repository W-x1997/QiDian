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
    <script type="text/javascript" src="jquery-2.1.1.js"> </script>
    <script type="text/javascript">
        function reg(){
            var reg=$("#register");
            window.location.href="reg.jsp";
        }
    </script>
  </head>
  <body>
  <h1>Welcome to NJUT!</h1>



  <input id="register" type="button" onclick="reg()" value="注册">
  <input type="button" value="登陆">

  </body>
</html>
