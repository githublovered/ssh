package com.zwl.service;

import java.util.List;

import com.zwl.po.Users;

public interface UserService {
	public List<Users> find(String name);
	public Users findByLoginId(String loginId);
}
