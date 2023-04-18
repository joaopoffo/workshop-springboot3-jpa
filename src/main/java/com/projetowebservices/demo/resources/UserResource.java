package com.projetowebservices.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetowebservices.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "9999", "123");
		return ResponseEntity.ok().body(u);
	}
}
