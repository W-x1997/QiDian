package com.iweb.qidian.servlet;

import com.iweb.qidian.pojo.BookInfoP;
import com.iweb.qidian.service.BookServiceImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends HttpServlet {
BookServiceImp bookServiceI=new BookServiceImp();


public void selectAllBook(HttpServletRequest request, HttpServletResponse response){
          String sql="select * from book_info";
          List<BookInfoP> bookInfoList=bookServiceI.selectAllBook(sql);
          request.setAttribute("bookList",bookInfoList);


    try {
        request.getRequestDispatcher("jsp/book/showSearch.jsp").forward(request,response);
    } catch (ServletException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }


}






    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        switch (path) {
            case "/showBook":
                selectAllBook(request, response);
                break;
        }
    }



    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

        doPost(request,response);
    }


}
