package com.zwl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zwl.dao.UserDAO;
import com.zwl.po.Users;
import com.zwl.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDao;
	
	@Transactional
	@Override
	public List<Users> find(String name) {
		return userDao.findAll();
	}

	@Override
	public Users findByLoginId(String loginId) {
		return userDao.findByLoginId(loginId);
	}
	
}
