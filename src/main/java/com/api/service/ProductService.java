package com.api.service;


import java.util.List;

import com.api.model.ProductDbModel;

public interface ProductService {
	
	public Integer setProduct(ProductDbModel productDbModel);
	
	public List<ProductDbModel> getAllProduct();

	
	public Integer deleteById(String id );
	
	public Integer updateProductById(ProductDbModel productDbModel ,String id);
	
	
	public List<ProductDbModel>byId(String id);
	
	

}
