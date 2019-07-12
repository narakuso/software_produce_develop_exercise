package com.qf.edu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.qf.edu.mapper.UserMapper;
import com.qf.edu.pojo.User;

public class UserService {
		
	@Autowired
	public UserMapper userMapper;
	
	public String checkName(String username) {
		//�û���ȥ���ո�
		String name = username.trim();
		if(name == null||name.equals("")) {
			//����һ�������ʾ�û��û�������Ϊ��
			return "2";
		}else {
			//�û������ã�����mapper��ѯ���
			User user = userMapper.selectByUserName(name);
			if(user == null) {
				//����1�������ע��
				return "1";
			}else {
				//��0�������û����Ѿ�����
				return "0";
			}
		}
	}
	
} 
