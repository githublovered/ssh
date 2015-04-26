package com.zwl.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.zwl.dao.BaseDAO;
import com.zwl.dao.StudentDAO;
import com.zwl.po.Student;
@Repository
public class StudentDAOImpl extends BaseDAO implements StudentDAO {

	@Override
	public List<Student> findAll() {
		String hql = "from Student";
		return this.getHibernateTemplate().find(hql);
	}

}
