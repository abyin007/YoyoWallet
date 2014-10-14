package com.yoyowallet.utils;

import java.util.HashMap;

/**
 * This class is a singleton class which holds details throughout the
 * application.
 * 
 * @author Aby
 */
public class ApplicationContext {

	private static HashMap<Object, Object> applicationContext;

	private ApplicationContext() {
	}

	public static HashMap<Object, Object> getInstance() {
		if (applicationContext == null) {
			applicationContext = new HashMap<Object, Object>();
		}
		return applicationContext;
	}
}
