package com.masai.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
