package com.yoyowallet.controllers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yoyowallet.user.services.UserServices;

@Controller
@RequestMapping("/user/*")
public class UserController {
	
	private UserServices userServices;
	
	@Autowired
	public UserController(UserServices userServices){
		this.userServices = userServices;
	}

}