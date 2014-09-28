package com.yoyowallet.bo;

import com.yoyowallet.dao.RegisterDAO;
import com.yoyowallet.dto.common.UserDetails;

public class RegisterBO {

	RegisterDAO registerDAO = new RegisterDAO();

	/**
	 * @param userDetails
	 */
	public void registerUser(UserDetails userDetails) {
		//TODO encrypt the password
		//registerDAO.registerUser(userDetails);
		registerDAO.registerUserUsingHibernate(userDetails);
	}
}
