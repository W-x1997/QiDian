package com.iweb.qidian.utils;

import com.iweb.qidian.model.UserInfo;

import java.sql.*;
import java.util.Date;

public class JDBCUtil {



    public static void main(String []args)  {


        Connection conn; //数据库的依次连接封装 Connection对象
        Statement state; //执行sql语句

        ResultSet result;//SQL查询结果集

        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/book";

            String username="root";
            String password="jsjywx123";

            conn=DriverManager.getConnection(url,username,password);

            state=conn.createStatement();

            UserInfo user=new UserInfo();
            user.setUaccount("huanghaojie");
            user.setUpwd("12345");

            Date date=new Date();
           Timestamp time=new Timestamp(date.getTime());
           user.setCreatetime(time);
           user.setNickname("黄豪杰");
           user.setMember(1);
           user.setLasttime(time);

           String sql="INSERT INTO user_info VALUES (0,'"+user.getUaccount()+"',"
                   +"'"
                   +user.getUpwd()+"','"
                   +user.getCreatetime()+"','"
                   +user.getNickname()+"','"
                   +user.getLasttime()+"',"
                   +user.getMember()+")";



           System.out.println(sql);

           state.execute(sql);


        } catch (Exception e) {
            e.printStackTrace();
        }





    }

}
