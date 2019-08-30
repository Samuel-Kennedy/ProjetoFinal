package com.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.ProductsModel;

public interface ProductRepository extends JpaRepository<ProductsModel, Long> {
	
}
