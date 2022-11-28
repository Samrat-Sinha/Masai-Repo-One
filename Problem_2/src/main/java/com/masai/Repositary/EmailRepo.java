package com.masai.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Email;
@Repository
public interface EmailRepo extends JpaRepository<Email, Integer>{

}
