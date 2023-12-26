package com.example.demo.controller;




import com.example.demo.entity.Book;
import com.example.demo.repo.bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class moviecontroller {

 @Autowired
private bookrepo bookr;

@GetMapping("/books")
    public List<Book> Books(){
    return bookr.findAll();

    }
    @GetMapping("/books/fiction")
    public List<Book> fiction(){
        return bookr.findByCat("fiction");

    }

    @GetMapping("/books/fantasy")
    public List<Book> fantasy(){
        return bookr.findByCat("fantasy");

    }

    @GetMapping("/books/{id}")
    Optional<Book> book(@PathVariable Integer id){
    return bookr.findById(id);
    }

    @PostMapping("/crb")
    public Book sendbook(@RequestBody Book book){



     return bookr.save(book);

    }


}
