package com.iweb.qidian.servlet;




import com.iweb.qidian.service.UserServiceI;
import com.iweb.qidian.service.UserServiceImp;
import com.iweb.qidian.utils.DataUtil;
import com.iweb.qidian.utils.JSONUtils;
import com.iweb.qidian.utils.JdbcUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


public class UserServlet extends HttpServlet {

    private static final long serialVersionUID=1L;
    private UserServiceI userServiceI=new UserServiceImp();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String path=request.getServletPath();

        switch (path){
            case "/login":
                login(request,response);
                break;
            case "/register":
                register(request,response);
                break;
            case "/reg":
                reg(request,response);
                break;
            case  "/logout":
                logout(request,response);
                break;

        }

//
//        String uaccount=request.getParameter("uaccount");
//        String upwd=request.getParameter("upwd");
//        String nickname=request.getParameter("nickname");
//
//        Date date=new Date();
//        Timestamp time=new Timestamp(date.getTime());
//        String sql="insert into user_info values (2,' "+uaccount
//                +"','"+upwd+"','"+time+"','"+nickname+"','"+time+"',"
//                +1+")";
//
//
//        System.out.println(sql);
        //boolean res=JdbcUtil.insert(sql);
        //  System.out.println("是否成功："+res);

    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

        doPost(request,response);
    }



    public void register(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
        String uaccount=request.getParameter("uaccout");
        String upwd1=request.getParameter("password");
        String upwd2=request.getParameter("password2");
        String nickname=request.getParameter("nickname");
        Date date=new Date();
        Timestamp time=new Timestamp(date.getTime());
        String sql="insert into user_info values (0,' "+uaccount
                +"','"+upwd1+"','"+time+"','"+nickname+"','"+time+"',"
                +1+")";

        boolean res=JdbcUtil.insert(sql);
        System.out.println("是否成功："+res);
        DataUtil data = new DataUtil();
        data.setResult(res);
        PrintWriter pw = response.getWriter();
        JSONUtils.writeJSON(pw,data);
//
//        if(res==true){
//            RequestDispatcher d = request.getRequestDispatcher("/index.jsp");
//            d.forward(request, response);
//        }else{
//            System.out.println("Err!");
//        }
    }

    public void login(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");


    }


    public void reg(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
        RequestDispatcher d = request.getRequestDispatcher("/jsp/include/fore/register.jsp");
        d.forward(request, response);
    }

    public void logout(HttpServletRequest request,HttpServletResponse response){

    }



}
