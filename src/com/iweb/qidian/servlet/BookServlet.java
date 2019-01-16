package com.iweb.qidian.servlet;

import com.iweb.qidian.model.Chapter;
import com.iweb.qidian.pojo.BookInfoP;
import com.iweb.qidian.service.BookServiceImp;
import com.iweb.qidian.utils.ReadWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class BookServlet extends HttpServlet {
BookServiceImp bookServiceI=new BookServiceImp();


public void selectAllBook(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {

    request.setCharacterEncoding("UTF-8");

    String bookName=request.getParameter("bname");
    String sql="";


    if("".equals(bookName)||null==bookName){  //模糊查询的判定
        sql="select * from book_info";
    }else {
        sql="select * from book_info where bname like '%"+bookName+"%'";
    }


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



    public void showchapter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         String bno=request.getParameter("bno");
           String chno=request.getParameter("chno");
        Chapter chapter=bookServiceI.selectChapterByVnoChno(bno,chno);
        List<String> chapterList=ReadWriter.readChapterByUrl(chapter.getChurl());
        BookInfoP book=bookServiceI.selectBookDetailByBno(String.valueOf(chapter.getBno()));
        request.setAttribute("chapterList",chapterList);
        request.setAttribute("book",book);
        request.setAttribute("chapter",chapter);

        request.getRequestDispatcher("jsp/book/showChapter.jsp").forward(request,response);



    }



    public void showdetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    String bno = request.getParameter("bno");
    BookInfoP bookInfoP = bookServiceI.selectBookDetailByBno(bno);
    request.setAttribute("book", bookInfoP);
    request.getRequestDispatcher("jsp/book/bookDetail.jsp").forward(request, response);



    }




    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String path = request.getServletPath();
        switch (path) {
            case "/showBook":
                selectAllBook(request, response);
                break;
            case "/bookDetail":
               showdetail(request, response);
                break;
            case "/chapter":
                showchapter(request,response);
                break;

        }
    }



    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {

        doPost(request,response);
    }


}
