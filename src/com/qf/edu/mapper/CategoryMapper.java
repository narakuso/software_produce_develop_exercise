package com.qf.edu.mapper;

import java.util.List;

import com.qf.edu.pojo.Category;
/**
 * @author wwb
 * @see 查询 所有的一级目录和二级目录
 * 
 * 
 */
public interface CategoryMapper {
		
	public List<Category> selectAll();
	
	
	
}
