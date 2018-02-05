package com.cloud.tpm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.tpm.model.Request;
import com.cloud.tpm.model.Responds;
import com.mysql.fabric.xmlrpc.base.Data;



@RestController
public class TestPortController {
	
	@GetMapping(value ="/")
	public String Home(HttpServletRequest http) {
		Data date=new Data();
		String TestService="TPM THhreeperson "+date.toString();
		return TestService;
	}
	@PostMapping(value ="/check")
	@ResponseBody
	public Responds TestRequest(@Valid @RequestBody Request request,HttpServletRequest http) {
		Responds res=new Responds();
		res.setName(res.getName()+" Responds for postman");
		return res;
	}
}
