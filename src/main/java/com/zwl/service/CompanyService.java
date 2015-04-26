package com.zwl.service;

import java.util.List;

import com.zwl.po.Company;
import com.zwl.vo.Page;

public interface CompanyService {
	public List<Company> findAll();
	public Page<Company> findPage(int index,int size);
}

