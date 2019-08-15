package com.yq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.yq.entity.Product;

public interface IProductDaoMapper {
	@Select("select * from product")
	public List<Product> findAll();
	@Insert("insert into product values(#{id},#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
	public int save(Product product);
	@Select("select * from product where id=#{id}")
	public Product getProductById(String id);
}
