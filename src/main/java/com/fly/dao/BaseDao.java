package com.fly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BaseDao {

	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		return conn;
	}
	
	public void closeRes(Connection conn,PreparedStatement pst,ResultSet rs) throws SQLException{
		if(null != rs){
			rs.close();
		}
		if(null != pst){
			pst.close();
		}
		if(null != conn){
			conn.close();
		}
	}
	
	public ResultSet query(String sql,Object[] params) throws ClassNotFoundException, SQLException{
		Connection conn = getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		for (int i = 0; i < params.length; i++) {
			ps.setObject(i+1, params[i]);
		}
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}
