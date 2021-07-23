package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entitites.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	// retorna todos os usuários
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	// retorna usuário por Id
	public Product findById(Long id) {
		Optional<Product> productRetorno = repository.findById(id);
		return productRetorno.get();
	}
}
