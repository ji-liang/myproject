package com.yq.service;

import java.util.List;
import com.yq.entity.Product;

public interface IProductService {
	public List<Product> findAll();
	public int save(Product product);
}
