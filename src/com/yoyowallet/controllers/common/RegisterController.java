package com.yoyowallet.controllers.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.yoyowallet.bo.RegisterBO;
import com.yoyowallet.dto.common.UserDetails;

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
	public String setUpRegister(Model model) {
		UserDetails registerForm = new UserDetails();
		model.addAttribute("registerForm", registerForm);
		return "register";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String registerUser(
			@ModelAttribute("registerForm") UserDetails userDetails, Model model) {
		RegisterBO registerBO = new RegisterBO();
		registerBO.registerUser(userDetails);
		return "registerSuccess";
	}

}
