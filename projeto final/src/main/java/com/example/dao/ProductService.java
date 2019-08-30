package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.repository.ProductRepository;
import com.example.model.ProductsModel;
@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<ProductsModel> listAll(){
		return repo.findAll();
	}
	
	public ProductsModel get(long idproduct) {
		return repo.findById(idproduct).get();		
	}
	public void save(ProductsModel product) {
		repo.save(product);
	}
	
	public void delete(long idproduct) {
		repo.deleteById(idproduct);
	}
}
