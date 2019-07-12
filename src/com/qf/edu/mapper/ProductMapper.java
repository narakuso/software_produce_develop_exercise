package com.qf.edu.mapper;

import java.util.List;

import com.qf.edu.pojo.Product;

/**
 * @author wwb
 *@see 商品操作的mapper接口
 *
 */
public interface ProductMapper {
		
	
  	public List<Product>  selectHot();
	public List<Product> selectNew();
	
}
