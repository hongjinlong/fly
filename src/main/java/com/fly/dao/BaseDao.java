package com.fly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * ClassName: BaseDao <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:分别定义了连接数据库，查询方法，增删改方法，和关闭连接的方法 <br/>  
 * date: 2016年9月4日 下午10:10:58 <br/>  
 *  
 * @author Administrator  
 * @version   
 * @since JDK 1.6
 */
public class BaseDao {
	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;
    public boolean getConnection(){
    	String url="jdbc:mysql://localhost:3306/jh";
        String username="root";
        String password="admin";
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		    con=DriverManager.getConnection(url, username, password);
    	}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    	return true;
    }
    public ResultSet getSelect(String sql,Object[] list){
    	getConnection();
        try {
			ps=con.prepareStatement(sql);
	        for(int i=0;i<list.length;i++){
	        	ps.setObject(i+1, list[i]);;	            
	        }
	        rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return rs;       
    }
    public int getUdi(String sql,Object[] list){
    	int row=0;
    	getConnection();
    	try {
			ps=con.prepareStatement(sql);
			for(int i=0;i<list.length;i++){
	    		ps.setObject(i+1,list[i]);
	    		row=ps.executeUpdate();
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         return row;   	
    	}
    public boolean Sclose(){
    	if(rs!=null){
    		try {
				rs.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
    	}
    	if(stmt!=null){
    		try {
				ps.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block				
				e.printStackTrace();
				return false;
			}   		
    	}
    	if(ps!=null){
    		try {
				ps.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block				
				e.printStackTrace();
				return false;
			}   		
    	}
    	if(con!=null){
    		try {
				con.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
    	}
    	 return true;
    }
    }
