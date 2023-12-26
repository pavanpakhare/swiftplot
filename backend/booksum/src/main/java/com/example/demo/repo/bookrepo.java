package com.example.demo.repo;


import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface bookrepo extends JpaRepository<Book, Integer> {

    List<Book> findByCat(String cat);
}
