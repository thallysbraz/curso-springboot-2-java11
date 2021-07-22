package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entitites.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	// retorna todos os usuários
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	// retorna usuário por Id
	public Order findById(Long id) {
		Optional<Order> orderRetorno = repository.findById(id);
		return orderRetorno.get();
	}
}
