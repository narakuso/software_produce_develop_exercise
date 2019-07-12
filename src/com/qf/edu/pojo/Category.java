package com.qf.edu.pojo;

import java.util.List;



/**
 * 
 * 
 * @author wwb
 * @see 商品展示页面分类的一级列表，对应数据库表category表
 *
 *
 */
public class Category {
	/*类别的id，数据库表的主键*/
	private int cId;
	/*类别名称，对应表中cname*/
	private String cName;
	/*一级目录和二级目录一对多的关系，关联二级目录*/
	private List<CategorySecond> list;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public List<CategorySecond> getList() {
		return list;
	}
	public void setList(List<CategorySecond> list) {
		this.list = list;
	}
	

}
