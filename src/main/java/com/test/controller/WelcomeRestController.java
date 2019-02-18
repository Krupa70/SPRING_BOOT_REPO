package com.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@RequestMapping(value="/welcome", method= RequestMethod.GET)
	public ResponseEntity<String> welcomeUser(){
		return new ResponseEntity<String>("Hi User. Welcome to the demo page", HttpStatus.OK);
	}
}
