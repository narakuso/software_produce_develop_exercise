package com.qf.edu.pojo;

import java.util.List;



/**
 * 
 * 
 * @author wwb
 * @see ��Ʒչʾҳ������һ���б���Ӧ���ݿ��category��
 *
 *
 */
public class Category {
	/*����id�����ݿ�������*/
	private int cId;
	/*������ƣ���Ӧ����cname*/
	private String cName;
	/*һ��Ŀ¼�Ͷ���Ŀ¼һ�Զ�Ĺ�ϵ����������Ŀ¼*/
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
