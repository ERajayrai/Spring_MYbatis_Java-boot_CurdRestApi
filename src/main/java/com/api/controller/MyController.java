package com.api.controller;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.ProductDbModel;
import com.api.model.response.JsonResponse;
import com.api.service.impl.ProductServiceImpl;




@CrossOrigin
@MappedTypes(ProductDbModel.class)
@MapperScan("com.api.mapper")
@RestController
public class MyController {
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	

	@RequestMapping(value ="/product/all",method=RequestMethod.GET)
	public @ResponseBody JsonResponse getAll( ){
		
		
		return new JsonResponse(null, null, productServiceImpl.getAllProduct());
	}
	
	@RequestMapping(value ="/product/add",method=RequestMethod.PUT)
	public @ResponseBody JsonResponse setProducs(@RequestBody ProductDbModel productDbModel ) {
		System.out.println(productDbModel.getPrice());
		
		return new JsonResponse(null, null, productServiceImpl.setProduct(productDbModel)) ;
	}
	
	@RequestMapping(value="/product/update",method=RequestMethod.POST)
	public @ResponseBody JsonResponse updateProduct(  @RequestParam String id ,@RequestBody ProductDbModel productDbModel  ) {
				System.out.println(productDbModel.getTitle());
		
		return new JsonResponse(null, null, productServiceImpl.updateProductById(productDbModel, id));
	}
	
	@RequestMapping(value ="/product/datele",method=RequestMethod.DELETE)
	public @ResponseBody JsonResponse deleteProduct(@RequestParam String id) {	
		return new JsonResponse(null, null, productServiceImpl.deleteById(id));
	}
	@RequestMapping (value ="product/id",method=RequestMethod.GET)
	public @ResponseBody JsonResponse getById(@RequestParam String id) {
		
		return new JsonResponse(null, null, productServiceImpl.byId(id));
	}
}
		
		


