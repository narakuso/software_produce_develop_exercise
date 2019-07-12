package com.qf.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.edu.mapper.ProductMapper;
import com.qf.edu.pojo.Product;

@Service
public class ProductService {
		
	@Autowired
	public ProductMapper productmapper;
	
	public List<Product>   selectHot(){
		List<Product>  list=productmapper.selectHot();
		if(list!=null&&list.size()>0) {
			return list; 
		}else {
			return null;
		}		
	}
	public List<Product>   selectNew(){
		List<Product>  list=productmapper.selectNew();
		if(list!=null&&list.size()>0) {
			return list; 
		}else {
			return null;
		}
		
		
	}	
}
