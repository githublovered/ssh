package com.zwl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwl.dao.CompanyDAO;
import com.zwl.po.Company;
import com.zwl.service.CompanyService;
import com.zwl.vo.Page;
import com.zwl.vo.PageRequest;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDAO companyDAO;
	
	/* (non-Javadoc)
	 * @see com.zwl.service.CompanyService#findAll()
	 */
	@Override
	public List<Company> findAll() {
		return companyDAO.findAll();
	}
	
	@Override
	public Page<Company> findPage(int index,int size){
		PageRequest pageRequest=new PageRequest(index,size);
		return companyDAO.findByPageRequest(pageRequest);
	}
}
