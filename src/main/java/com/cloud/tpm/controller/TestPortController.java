package com.cloud.tpm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.fabric.xmlrpc.base.Data;

@RestController
public class TestPortController {
	
	@GetMapping(value ="/")
	public String Home(HttpServletRequest http) {
		Data date=new Data();
		String TestService="TPM THhreeperson "+date.toString();
		return TestService;
	}
}
