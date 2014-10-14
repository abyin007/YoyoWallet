package com.yoyowallet.bo;

import com.yoyowallet.dao.LoginDAO;
import com.yoyowallet.dto.common.Login;

/**
 * This class involves business logic for login operation.
 * 
 * @author Aby
 * 
 */
public class LoginBO {

	LoginDAO loginDAO = new LoginDAO();

	public String loginUser(Login login) {
		// TODO: Perform validation, also retrieve the entire userdetails
		// instead of just a boolean value.
		return loginDAO.loginUser(login);
	}

}
