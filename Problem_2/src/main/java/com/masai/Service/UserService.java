package com.masai.Service;

import java.util.List;

import com.masai.Model.User;

public interface UserService {
	
	public List<User> getAllUser();
	
	public User createUser(User user);
	
	public User getUserbyId(int id);
	
	public User deleteUserById(int id);
	
	

}
