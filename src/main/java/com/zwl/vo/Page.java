package com.zwl.vo;

import java.util.List;

/**   
 * @Package com.jinzhiyun4j.ssh2.vo
 * @Class com.jinzhiyun4j.ssh2.vo.Pager 
 * @Description: 分页辅助类
 * @author 
 * @date 2015年4月18日 下午3:07:12 
 * @version V1.0
 * Copyright  Corporation 2015       
 */
public class Page<T> {
	private List<T> data; //数据
 	private Integer size; //每页大小
 	private Long total; //总条数
 	private Integer index;//当前页
 	
 	
 	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	/**
 	 * 是否包含有数据
 	 * @return
 	 */
 	public boolean hashData(){
 		return data==null?false:(data.size()>0);
 	}
 	
 	/**
 	 * 总页数
 	 * @return
 	 */
 	public Integer getTotalPage(){
 		if(hashData() && size!=0){
 			int t=total.intValue();
 			return  t%size==0?t/size:t/size+1;
 		}
 		return 0;
 	}
 	
 	/**
 	 * 是否有下一页
 	 * @return
 	 */
 	public boolean hashNext(){
 		return index<getTotalPage();
 	}
 	
 	/**
 	 * 是否有上一页
 	 * @return
 	 */
 	public boolean hashPrevious(){
 		return index>1;
 	}
 	
 	/**
 	 * 是否是第1页
 	 * @return
 	 */
 	public boolean isFirst(){
 		return index==1;
 	}
 	
 	/**
 	 * 是否是最后一页
 	 * @return
 	 */
 	public boolean isLast(){
 		return index==this.getTotalPage();
 	}
 	
 	/**
 	 * 当前页请求参数
 	 * @return
 	 */
 	public String getCurrentParameter(){
 		return "index="+index+"&size="+size;
 	}
 	/**
 	 * 下一页请求参数 
 	 * @return
 	 */
 	public String getNextPageParameter(){
 		if(hashNext()){
 			return "index="+(index+1)+"&size="+size;
 		}
 		return "";
 	}
 	/**
 	 * 下一页请求参数 
 	 * @return
 	 */
 	public String getPrePageParameter(){
 		if(hashPrevious()){
 			return "index="+(index-1)+"&size="+size;
 		}
 		return "";
 	}
 	
 	/**
 	 * 第一页请求参数 
 	 * @return
 	 */
 	public String getFirstPageParameter(){
 		if(hashData()){
 			return "index=1&size="+size;
 		}
 		return "";
 	}
 	
 	/**
 	 *最后一页
 	 * @return
 	 */
 	public String getLastPageParameter(){
 		if(hashData()){
 			return "index="+getTotalPage()+"&size="+size;
 		}
 		return "";
 	}
 	/**
 	 * 取得指定页的参数
 	 * @return
 	 */
 	public String getPageParameter(int pageIndex){
 		if(pageIndex>=1 && pageIndex<=getTotalPage()){
 			return "index="+pageIndex+"&size="+size;
 		}
 		return "";
 	}
 	
	
	
}

