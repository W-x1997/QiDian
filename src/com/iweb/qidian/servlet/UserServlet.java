package com.iweb.qidian.servlet;




import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class UserServlet extends HttpServlet {

    private static final long serialVersionUID=1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req,resp);
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        String uaccount=request.getParameter("uaccount");
        String upwd=request.getParameter("upwd");
        String nickname=request.getParameter("nickname");


        System.out.println(uaccount+"  "+upwd+"  "+nickname);
    }



}
