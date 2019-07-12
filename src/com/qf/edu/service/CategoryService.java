package com.qf.edu.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.edu.mapper.CategoryMapper;
import com.qf.edu.pojo.Category;

/**
 * @author wwb
 *
 *@see service类属于业务逻辑层，主要进行数据判断和业务逻辑处理
 *				当前是目录的业务逻辑层
 *
 *
 */
public class CategoryService {
	
		@Autowired
		public CategoryMapper categoryMapper;
	
		/*查询所有的目录*/
		public List<Category>  selectAllCategory(){
			//调用mapper中方法，获取数据库操作结果
			     List<Category> list = categoryMapper.selectAll();
			     if(list!=null&&list.size()>0) {
			    	 return list;
			     }else {
			    	 return null;
			     }
		}
	
	
}
