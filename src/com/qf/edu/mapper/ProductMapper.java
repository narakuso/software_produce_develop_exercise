package com.qf.edu.mapper;

import java.util.List;

import com.qf.edu.pojo.Product;

/**
 * @author wwb
 *@see ��Ʒ������mapper�ӿ�
 *
 */
public interface ProductMapper {
		
	
  	public List<Product>  selectHot();
	public List<Product> selectNew();
	
}
