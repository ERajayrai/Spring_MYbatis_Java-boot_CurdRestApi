package com.api.model;

import java.sql.Date;



import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDbModel {
	private int  id;
	private  String title;
	private float price;
	private  String description;
	private Date createDate ;
	private String useDate;
	
}
