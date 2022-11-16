package com.auth_project.auth_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth_project.auth_api.entity.AuthRequest;
import com.auth_project.auth_api.entity.User;
import com.auth_project.auth_api.service.UserService;
import com.auth_project.auth_api.util.JwtUtil;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@GetMapping("/")
	public String getData()
	{
		return "hello";
	}
	
	@PostMapping("/register")
	public ResponseEntity<User> createUserEndpoint(@RequestBody User user)
	{		
		
		String pass=passwordEncoder.encode(user.getPassword());
		user.setPassword(pass);
		
		return ResponseEntity.ok().body(userService.createUser(user));
		
	}
	
	@PostMapping("/login")
	public String login(@RequestBody AuthRequest authRequest) throws Exception {
		
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
					);
		}
		catch(Exception e)
		{
			throw new Exception("Invalid Username or Password");
		}
		
		return jwtUtil.generateToken(authRequest.getUsername());
	}

}