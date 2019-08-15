package com.yq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yq.entity.Product;
import com.yq.mapper.IProductDaoMapper;
@Service("productService")
public class ProductServiceImpl implements IProductService {
	@Autowired
	private IProductDaoMapper productMapper;
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productMapper.findAll();
	}
	public int save(Product product) {
		// TODO Auto-generated method stub
		return productMapper.save(product);
	}

}
