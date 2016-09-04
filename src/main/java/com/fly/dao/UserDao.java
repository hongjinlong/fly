/**  
 * Project Name:fly  
 * File Name:UserDao.java  
 * Package Name:com.fly.dao  
 * Date:2016年9月4日下午8:53:37  
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.  
 *  
*/  
  
package com.fly.dao;  
/**  
 * ClassName:UserDao <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年9月4日 下午8:53:37 <br/>  
 * @author   Administrator  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */

import java.util.List;
import com.fly.po.Users;


public interface UserDao{
	   /**
	    * 
	    * getLogin:用于对用户登陆的判断. <br/>  
	    * TODO(这里描述这个方法适用条件 – 可选).<br/>  
	    * TODO(这里描述这个方法的执行流程 – 可选).<br/>  
	    * TODO(这里描述这个方法的使用方法 – 可选).<br/>  
	    * TODO(这里描述这个方法的注意事项 – 可选).<br/>  
	    *  
	    * @author Administrator  
	    * @return  
	    * @since JDK 1.6
	    */
	   public Users getLogin(String name,String password);        
}