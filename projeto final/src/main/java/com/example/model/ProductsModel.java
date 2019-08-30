package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductsModel {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String brand;
	private String madein;
	private float price;
	private String nome;
	
	public ProductsModel() {
		
	}
	public ProductsModel(Long id, String brand, String madein, float price, String nome) {
		
		this.id = id;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
		this.nome = nome;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	}

