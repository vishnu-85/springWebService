package com.restful.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.restful.model.User;


public class UserDAO {
	
	private HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	} 
	
	public HibernateTemplate getHibernateTemplate(){
		    return template;
		  }

	
	public List<User> getUserList(){  
	    List<User> list=new ArrayList<User>();
	   list = template.loadAll(User.class);
	    return list;
		} 
	
	public int saveUser(User user){
		System.out.println("save user");
		return (Integer) template.save(user);
	}
	
	/*public User getUserById(int userid){
		List<User> user = new ArrayList<User>();
		user.add(new User(1, "chandra@gmail.com", "1234"));
		user.add(new User(2, "ram@gmail.com", "1223"));
		user.add(new User(3, "vishnu@gmail.com", "12313"));
			
		return user.get(userid);
	}
	
	
	public List<User> getUserList(){
		List<User> user = new ArrayList<User>();
		user.add(new User(1, "chandra@gmail.com", "1234"));
		user.add(new User(2, "ram@gmail.com", "1223"));
		user.add(new User(3, "vishnu@gmail.com", "12313"));
		user.add(new User(4, "saim@gmail.com", "22313"));
		user.add(new User(5, "jac@gmail.com", "762313"));
		user.add(new User(6, "raj@gmail.com", "7w2313"));
		return user;	
		}*/
	

	
}
