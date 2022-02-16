package com.api.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.mapper.ProductMapper;
import com.api.model.ProductDbModel;
import com.api.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductMapper productMapper;
	

	@Override
	@Transactional
	public Integer setProduct(ProductDbModel productDbModel) {
		
	int	myModel=  productMapper.setNewProduct(productDbModel);
		
		if(myModel==1) {
			
			return 1;
		}else {
			return 0;
		}
			// TODO Auto-generated method stub
	}


	@Override
	public List<ProductDbModel> getAllProduct() {
		List<ProductDbModel> productDbModel=productMapper.findAll();
		// TODO Auto-generated method stub
		return productDbModel;
	}


	@Override
	public Integer deleteById(String id) {
		int delete=productMapper.deleteById(id);
		// TODO Auto-generated method stub
		return delete;
	}


	@Override
	public Integer updateProductById(ProductDbModel productDbModel, String id) {
		int res=productMapper.updateProduct(productDbModel, id);
		// TODO Auto-generated method stub
		return res;
	}


	@Override
	public List<ProductDbModel> byId(String id) {
		// TODO Auto-generated method stub
		
		List<ProductDbModel> list=productMapper.getByID(id);
		return list;
	}

}
