package com.yoyowallet.controllers.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoyowallet.dtos.common.Login;
import com.yoyowallet.dtos.common.UserDetails;

/**
 * 
 * This class is used to setting up and hitting the register page.
 * 
 * @author Aby
 * 
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String register(Model model) {
		UserDetails registerForm = new UserDetails();
		model.addAttribute("registerForm", registerForm);
		return "register";
	}

}
