package com.zwl.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zwl.dao.BaseDAO;
import com.zwl.dao.CompanyDAO;
import com.zwl.po.Company;
import com.zwl.vo.Page;
import com.zwl.vo.PageRequest;


@Repository
public class CompanyDAOImpl extends BaseDAO implements CompanyDAO {

	/* (non-Javadoc)
	 * @see com.zwl.dao.CompanyDAO#findAll()
	 */
	@Override
	public List<Company> findAll() {
		String hql="from Company";
		return super.getHibernateTemplate().find(hql);
	}

	/* (non-Javadoc)
	 * @see com.zwl.dao.CompanyDAO#findByPageRequest(com.zwl.vo.PageRequest)
	 */
	@Override
	public Page<Company> findByPageRequest(final PageRequest pageRequest) {
		HibernateTemplate template=super.getHibernateTemplate();
		@SuppressWarnings("unchecked")
		List<Company> list= (List<Company>)template.executeFind(new HibernateCallback<List<Company>>() {
			@Override
			public List<Company> doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql="from Company c";
				Query query=session.createQuery(hql);
				query.setMaxResults(pageRequest.getSize());
				query.setFirstResult(pageRequest.getFirstResult());
				return query.list();
			}
		});
		
		Page<Company> page=new Page<Company>();
		page.setData(list);
		page.setIndex(pageRequest.getIndex());
		page.setSize(pageRequest.getSize());
		String hql="select count(c) from Company c";
		Long total=(Long)template.find(hql).iterator().next();
		page.setTotal(total);
		return page;
	}

}
