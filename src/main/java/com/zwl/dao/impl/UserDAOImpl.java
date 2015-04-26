package com.zwl.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zwl.dao.BaseDAO;
import com.zwl.dao.UserDAO;
import com.zwl.po.Users;
@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@Override
	public List<Users> findAll() {
		String hql = "from Users";
		return this.getHibernateTemplate().find(hql);
	}

	@Override
	public Users findByLoginId(String loginId) {
		String hql = "from Users where loginId = ?";
		List<Users> list = this.getHibernateTemplate().find(hql,loginId);
		Users user = null;
		if(!list.isEmpty()) {
			user = list.get(0);
		}
		return user;
	}

}
