package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entitites.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	// retorna todos os usuários
	public List<User> findAll() {
		return repository.findAll();
	}
	
	// retorna usuário por Id
	public User findById(Long id) {
		Optional<User> userRetorno = repository.findById(id);
		return userRetorno.get();
	}
}
