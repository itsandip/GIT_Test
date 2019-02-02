package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/userList")
	public List<User> getUserList(){
		User u1=new User("sandip","sandip@gmail.com");
		User u2=new User("kumar","kumar@gmail.com");
		
		List<User> userList=new ArrayList<>();
		userList.add(u1);
		userList.add(u2);
		return userList;
	}
}
