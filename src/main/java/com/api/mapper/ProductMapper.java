package com.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.api.model.ProductDbModel;

@Mapper
public interface ProductMapper {
	
	//get retrive all the data from database
	@Select("SELECT * FROM PRODUCT")
	List<ProductDbModel>findAll();
	
	
	// insert data into database
	@Insert("insert into product(id,price,title,description,createDate,useDate)"+"values( #{id},  #{price},#{title},   #{description} , #{createDate},   #{useDate})")
	public int setNewProduct(ProductDbModel productDbModel);
	
	
	
	//delete query 
	@Delete("DELETE FROM product WHERE id=#{id}")
	public int deleteById (String id);
	
	
	//update query
	
	@Update("update product set title= #{title} ,price=#{price},description=#{description}, createDate=#{createDate},useDate=#{useDate}   where id=#{id}")
	public Integer updateProduct(ProductDbModel productDbModel ,String id);
	
	@Select("select * from product where id=#{id}")
	public List <ProductDbModel>getByID(String id);
	
	
	
	
	
	
	
	
	
	
}
