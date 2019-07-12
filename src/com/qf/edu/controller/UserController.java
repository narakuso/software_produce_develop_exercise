package com.qf.edu.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qf.edu.service.UserService;



@Controller
public class UserController {

	@Autowired
	public UserService userService;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/regist")	
	public String register(){
			return "regist";
		}
	@RequestMapping("/checkName")
	public void checkName(@RequestParam String username,HttpServletResponse resp) {
		
		String result=userService.checkName(username);
		//用httpServletResponse向前端响应结果
		
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
