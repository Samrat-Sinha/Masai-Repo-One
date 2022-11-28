package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Model.User;
import com.masai.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUserHandler(){
		List<User> user = uService.getAllUser();
		
		return new ResponseEntity<List<User>>(user,HttpStatus.OK);
	}
	
	
	@PostMapping("/users")
	public ResponseEntity<User> createUserHandler(@RequestBody User user){
		User saveUser = uService.createUser(user);
		
		return new ResponseEntity<User>(saveUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserByIdHandler(@PathVariable("id") Integer id){
		User user = uService.getUserbyId(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<User> deletebyIdHandler(@PathVariable("id") Integer id){
		User deletedUser = uService.deleteUserById(id);
		return new ResponseEntity<User>(deletedUser,HttpStatus.OK);
	}
}
