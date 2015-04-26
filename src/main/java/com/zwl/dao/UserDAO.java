package com.zwl.dao;

import java.util.List;

import com.zwl.po.Users;

public interface UserDAO {
	public List<Users> findAll();
	public Users findByLoginId(String loginId);
}
