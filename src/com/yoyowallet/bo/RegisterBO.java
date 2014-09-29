package com.yoyowallet.bo;

import com.yoyowallet.dao.RegisterDAO;
import com.yoyowallet.dto.common.UserDetails;

public class RegisterBO {

	RegisterDAO registerDAO = new RegisterDAO();

	/**
	 * Business logic for registration.
	 * 
	 * @param userDetails
	 */
	public boolean registerUser(UserDetails userDetails) {
		// TODO encrypt the password, perform validation, check if username and
		// email already exists
		return registerDAO.registerUser(userDetails);
		// registerDAO.registerUserUsingHibernate(userDetails);
	}
}
