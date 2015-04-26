package com.zwl.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "company")
public class Company extends BaseEntity implements Serializable {
	@Column(name = "name",  nullable = false, length = 50)
	private String name; //公司名称
	@Column(name = "address",  nullable = true, length = 150)
	private String address; //地址
	@Column(name = "intro",  nullable = true, length = 500)
	private String intro; //简介
	@Column(name = "principal",  nullable = false, length = 25)
	private String principal;//负责人
	@Column(name = "principalTel",  nullable = false, length = 20)
	private String principalTel;//负责人电话
	@Column(name = "tel",  nullable = true, length = 20)
	private String tel; //公司电话
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="parentCompanyId")
	private Company parentCompany; //父公司

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getPrincipalTel() {
		return principalTel;
	}

	public void setPrincipalTel(String principalTel) {
		this.principalTel = principalTel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Company getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(Company parentCompany) {
		this.parentCompany = parentCompany;
	}
	
	
	
}

