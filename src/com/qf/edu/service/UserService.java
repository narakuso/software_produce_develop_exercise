package com.qf.edu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.qf.edu.mapper.UserMapper;
import com.qf.edu.pojo.User;

public class UserService {
		
	@Autowired
	public UserMapper userMapper;
	
	public String checkName(String username) {
		//用户名去掉空格
		String name = username.trim();
		if(name == null||name.equals("")) {
			//返回一个结果提示用户用户名不能为空
			return "2";
		}else {
			//用户名可用，调用mapper查询结果
			User user = userMapper.selectByUserName(name);
			if(user == null) {
				//返回1代表可以注册
				return "1";
			}else {
				//“0”代表用户名已经存在
				return "0";
			}
		}
	}
	
} 
