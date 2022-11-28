package com.masai.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Model.User;
import com.masai.Repositary.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo uRepo;
	
	@Override
	public List<User> getAllUser() {
        
		List<User> users = uRepo.findAll();
		return users;
	}

	@Override
	public User createUser(User user) {
		User saveUser = uRepo.save(user);
		return saveUser;
	}

	@Override
	public User getUserbyId(int id) {
		 Optional<User> opt=uRepo.findById(id);
	      User user = opt.get();
	      return user;
	}

	@Override
	public User deleteUserById(int id) {
		  Optional<User> opt=uRepo.findById(id);
	      User user = opt.get();
	      uRepo.delete(user);
	      return user;
	}

}
