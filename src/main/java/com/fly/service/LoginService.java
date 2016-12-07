package com.fly.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.fly.dao.BaseDao;
import com.fly.po.User;

public class LoginService {

	private BaseDao dao;
	
	
	public LoginService() {
		dao = new BaseDao();
	}


	public boolean isLogin(User user) throws ClassNotFoundException, SQLException{
		String sql = "select name,password from user where name = ? and password = ?";
		Object[] params = {user.getName(),user.getPassword()};
		ResultSet rs = dao.query(sql, params);
		if(rs.next()){
			/*while(rs.next()){
				String name = rs.getString("name");
				String password = rs.getString("password");
				User sql_user = new User(name, password);
				if(sql_user.equals(user)){
					return true;
				}
			}*/
			return true;
		}
		return false;
	}
	
}
