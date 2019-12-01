package com.maid;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maid.dto.Response;
import com.maid.model.User;
import com.maid.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	Logger log = LoggerFactory.getLogger(this.getClass());

	@PostMapping("/register")
	public ResponseEntity<Response> createUser(@RequestBody @Valid User user) {
		System.out.println(user.toString());
		userRepository.save(user);
		Response response = new Response();
		response.setBody(user);
		response.setCode("200 OK");
		response.setMessage("user created successfully");
		return ResponseEntity.ok().body(response);
	}
}
