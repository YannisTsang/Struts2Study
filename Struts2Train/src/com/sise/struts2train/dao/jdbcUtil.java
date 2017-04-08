package com.sise.struts2train.dao;



import javax.xml.transform.Result;
import java.sql.*;

/**
 * Created by Administrator on 2017/4/4.
 */
public class jdbcUtil {
    private static Connection conn=null;

    //这是一个单例模型
    static{
         try {
              Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException e) {
               e.printStackTrace();
            }
    }


    public static Connection getConn(){

        try {

            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","Yannis55zyz");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConn(Connection conn){
        try {
                if(conn!=null)
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public static void closePstmt(PreparedStatement pstmt){
        try {
            if(pstmt!=null)
                pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeRs(ResultSet rs){
        try {
            if(rs!=null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
