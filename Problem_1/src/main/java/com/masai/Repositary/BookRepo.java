package com.masai.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Model.Book;
@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
