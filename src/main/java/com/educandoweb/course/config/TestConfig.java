package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entitites.Order;
import com.educandoweb.course.entitites.User;
import com.educandoweb.course.entitites.enums.OrderStatus;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// Users
		User u1 = new User(null, "Thallys", "thallys@gmail.com", "996344135", "123456"); 
		User u2 = new User(null, "Braz", "braz@gmail.com", "998033526", "123456"); 
		
		// Orders
		Order o1 = new Order(null, Instant.parse("2018-06-20T19:53:07Z"), OrderStatus.CANCELED, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2020-07-22T15:21:22Z"), OrderStatus.PAID, u1);
		Order o4 = new Order(null, Instant.parse("2021-07-22T15:21:22Z"), OrderStatus.DELIVERED, u2);
		
		//salvando no banco de dados
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4));
	}
}
