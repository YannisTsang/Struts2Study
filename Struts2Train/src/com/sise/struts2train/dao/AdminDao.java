package com.sise.struts2train.dao;

import com.sise.struts2train.entity.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/4/5.
 */
public class AdminDao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    //验证管理员登陆
    public boolean login(Admin admin){
        boolean flag=false;
        conn=jdbcUtil.getConn();
        String sql="select * from admin where username=? and password=? ";
        try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,admin.getAdminname());
            pstmt.setString(2,admin.getAdminpassword());
            rs=pstmt.executeQuery();
            if(rs.next()){
                flag=true;
                admin.setQx(rs.getInt("qx"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            this.close();
        }
        return flag;
    }

    public void close(){
        jdbcUtil.closeRs(rs);
        jdbcUtil.closePstmt(pstmt);
        jdbcUtil.closeConn(conn);
    }
}
