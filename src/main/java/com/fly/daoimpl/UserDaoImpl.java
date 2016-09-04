/**  
 * Project Name:fly  
 * File Name:UserDaoImpl.java  
 * Package Name:com.fly.daoimpl  
 * Date:2016年9月4日下午9:14:12  
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.fly.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.fly.dao.BaseDao;
import com.fly.dao.UserDao;
import com.fly.po.Users;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:针对用户表的增删改查 <br/>  
 * Date:     2016年9月4日 下午9:14:12 <br/>  
 * @author   Administrator  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class UserDaoImpl extends BaseDao implements UserDao{
	@Override
	public Users getLogin(String name,String password) { 
		Users users=new Users();
		String sql="select * from users where name='"+name+"' and password='"+password+"'";
		Object[] list={};
		ResultSet rs=this.getSelect(sql, list);
		try {
			while(rs.next()){
				users.setId(rs.getInt("Id"));
				users.setName(rs.getString("Name"));
				users.setPassword(rs.getString("PassWord"));
			}
		} catch (SQLException e) {			  
			// TODO Auto-generated catch block  
			e.printStackTrace();  			
		}finally{
			this.Sclose();
		}
		return users;
	}
}
  
