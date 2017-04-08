package com.sise.struts2train.dao;

import com.sise.struts2train.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/2.
 */
public class UserDao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public int update(User user){
        int i=0;
        conn=jdbcUtil.getConn();
        String sql="update employee1 set password=? where username=?";
        try{
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,user.getPassword());
            pstmt.setString(2,user.getUsername());
            i=pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally {
            jdbcUtil.closeRs(rs);
            jdbcUtil.closePstmt(pstmt);
            jdbcUtil.closeConn(conn);
        }
        return i;
    }

    //查找个人信息的方法
    public User selectInfo(String username){
        User user=new User();
        conn=jdbcUtil.getConn();
        String sql="select * from employee1 where username=?";
        try{
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,username);
            rs=pstmt.executeQuery();
            if(rs.next()){
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            jdbcUtil.closeRs(rs);
            jdbcUtil.closePstmt(pstmt);
            jdbcUtil.closeConn(conn);
        }
        return user;
    }

    //查找所有的用户
    public List findAllUser(){
        List<User> list=new ArrayList<User>();
        conn=jdbcUtil.getConn();
        try{
            String sql="select * from employee1";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();

            while(rs.next()){
                User user=new User();//必须放在这里，否则每次放进list的都系同一个对象
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                list.add(user);
            }
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            jdbcUtil.closeRs(rs);
            jdbcUtil.closePstmt(pstmt);
            jdbcUtil.closeConn(conn);
        }
        return list;
    }

    //验证登陆的代码
    public boolean login(User user){
        boolean flag=false;
        conn=jdbcUtil.getConn();
        try{
            String sql="select * from employee1 where username=? and password=? ";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getPassword());
            rs=pstmt.executeQuery();
            if(rs.next()){
                flag=true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }finally {
            jdbcUtil.closeRs(rs);
            jdbcUtil.closePstmt(pstmt);
            jdbcUtil.closeConn(conn);
        }
        return flag;
    }

    //保存一个用户
    public int save(User user){
        int i=0;
        conn=jdbcUtil.getConn();
        try{
            String sql="insert into `employee1` (`username`,`password`)"+" values (?,?); ";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getPassword());
            i=pstmt.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            jdbcUtil.closeRs(rs);
            jdbcUtil.closePstmt(pstmt);
            jdbcUtil.closeConn(conn);
        }
        return i;
    }

    //查找用户是否存在
    public boolean findUser(String username){
        boolean flag=false;
        conn=jdbcUtil.getConn();
        try{
            pstmt=conn.prepareStatement("select * from employee1 where username=?");
            pstmt.setString(1,username);
            rs=pstmt.executeQuery();
            if(rs.next()){
                flag=true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally {
            jdbcUtil.closeRs(rs);
            jdbcUtil.closePstmt(pstmt);
            jdbcUtil.closeConn(conn);
        }
        return flag;
    }
}
