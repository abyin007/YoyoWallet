package com.yoyowallet.controllers.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoyowallet.bo.LoginBO;
import com.yoyowallet.dto.common.Login;

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
	public String setupLogin(Model model) {
		Login loginForm = new Login();
		model.addAttribute("loginForm", loginForm);
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String loginUser(
			@ModelAttribute("loginForm") Login login, Model model) {
		LoginBO loginBO = new LoginBO();
		String username = loginBO.loginUser(login);
		if (null != username) {
			model.addAttribute("username", username);
			return "user/userHome";
		} else {
			return "loginFailure";
		}
	}

}
