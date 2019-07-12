package com.qf.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qf.edu.pojo.Category;
import com.qf.edu.pojo.Product;
import com.qf.edu.service.CategoryService;
import com.qf.edu.service.ProductService;

/**
 * 
 * @author Administrator 
 *  
 *@see ��ҳ�Ŀ�������������ҳ������ʵĿ��ƣ���ҳ���������ݼ��صĿ���
 *
 *
 */


@Controller
public class IndexController {
	
	@Autowired
	public CategoryService categoryService;

	@Autowired
	public ProductService productService;
	
	@RequestMapping("/index")
	public String  index(Model model,HttpServletRequest req) {
		
//		��ѯ�˵������ݣ����ظ�ǰ��
		List<Category> cList=categoryService.selectAllCategory();
		System.out.println(cList);
		System.out.println("Hello World");
		model.addAttribute("cList",cList);
		List<Product> hList=productService.selectHot();
		if(hList==null) {
			req.getSession().setAttribute("product", "1");
		}else {
			model.addAttribute("hList",hList);
		}
		List<Product> nList=productService.selectNew();
		if(nList==null) {
			
		}else {
			model.addAttribute("nList",nList);
		}
//		������ҳ����
		return "index";
	}
	
}
