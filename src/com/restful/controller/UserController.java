package com.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.dao.UserDAO;
import com.restful.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserDAO userdao;
	
	@RequestMapping(value = "/user" , method = RequestMethod.GET, produces = "application/json" )
	@ResponseBody
	public List<User> getUserList(){
		//UserDAO userdao = new UserDAO();
			List<User> ulist = userdao.getUserList();
		return ulist;
	}

	@RequestMapping(value = "/saveuser" , method = RequestMethod.POST, produces = "application/json" )
	public int saveUser(@RequestBody User user){
		return userdao.saveUser(user);
		
	}
	
	
	/*@RequestMapping(value = "/user/{userid}" , method = RequestMethod.GET, produces = "application/json" )
	@ResponseBody
	public User getUserById(@PathVariable(value = "userid") int userid){
		UserDAO userdao = new UserDAO();
		User ulist = userdao.getUserById(userid-1);
		return ulist;
	}	*/

}
