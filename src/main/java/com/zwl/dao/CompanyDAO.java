package com.zwl.dao;

import java.util.List;

import com.zwl.po.Company;
import com.zwl.vo.Page;
import com.zwl.vo.PageRequest;

public interface CompanyDAO {
	public List<Company> findAll();
	public Page<Company> findByPageRequest(PageRequest pageRequest);
}

