package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entitites.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	// retorna todos os usuários
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	// retorna usuário por Id
	public Category findById(Long id) {
		Optional<Category> categoryRetorno = repository.findById(id);
		return categoryRetorno.get();
	}
}
