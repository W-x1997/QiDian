package com.iweb.qidian.servlet;




import com.iweb.qidian.utils.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;


public class UserServlet extends HttpServlet {

    private static final long serialVersionUID=1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String uaccount=request.getParameter("uaccount");
        String upwd=request.getParameter("upwd");
        String nickname=request.getParameter("nickname");

        Date date=new Date();
        Timestamp time=new Timestamp(date.getTime());
        String sql="insert into user_info values (2,' "+uaccount
                +"','"+upwd+"','"+time+"','"+nickname+"','"+time+"',"
                +1+")";


        System.out.println(sql);
      boolean res=JdbcUtil.insert(sql);
      System.out.println("是否成功："+res);
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

        doPost(request,response);
    }



}
