package com.yoyowallet.controllers.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoyowallet.dtos.common.Login;

/**
 * 
 * This class is used to setting up and hitting the login page.
 * 
 * @author Aby
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		Login loginForm = new Login();
		model.addAttribute("loginForm", loginForm);
		return "login";
	}

}
