package com.qf.edu.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.edu.mapper.CategoryMapper;
import com.qf.edu.pojo.Category;

/**
 * @author wwb
 *
 *@see service������ҵ���߼��㣬��Ҫ���������жϺ�ҵ���߼�����
 *				��ǰ��Ŀ¼��ҵ���߼���
 *
 *
 */
public class CategoryService {
	
		@Autowired
		public CategoryMapper categoryMapper;
	
		/*��ѯ���е�Ŀ¼*/
		public List<Category>  selectAllCategory(){
			//����mapper�з�������ȡ���ݿ�������
			     List<Category> list = categoryMapper.selectAll();
			     if(list!=null&&list.size()>0) {
			    	 return list;
			     }else {
			    	 return null;
			     }
		}
	
	
}
