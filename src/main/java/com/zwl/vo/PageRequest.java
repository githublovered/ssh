package com.zwl.vo;

import java.util.Map;

/**   
 * @Package
 * @Class 
 * @Description: 封装分页请求信息
 * @author 
 * @date 2015年4月18日 下午8:31:16 
 * @version V1.0
 * Copyright  Corporation 2015       
 */
public class PageRequest {
	private Integer index;
	private Integer size;
	private Map<String, String> condition;
	
	
	public PageRequest(Integer index, Integer size) {
		super();
		this.index = index;
		this.size = size;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Map<String, String> getCondition() {
		return condition;
	}
	public void setCondition(Map<String, String> condition) {
		this.condition = condition;
	}
	
	public Integer getFirstResult(){
		return (index-1)*size;
	}
	
}
