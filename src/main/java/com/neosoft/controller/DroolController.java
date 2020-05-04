package com.neosoft.controller;

import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.bean.UserBean;

@RestController
public class DroolController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DroolController.class);

	@Autowired
	private KieSession kieSession;

	@PostMapping("/user")
	public UserBean checkUser(@RequestBody UserBean userBean) {
		
		LOGGER.info("Incoming UserBean :: " + userBean.toString());
		
		this.kieSession.insert(userBean);
		this.kieSession.fireAllRules();
		
		LOGGER.info("Returned UserBean :: " + userBean.toString());
		
		return userBean;

	}
}
