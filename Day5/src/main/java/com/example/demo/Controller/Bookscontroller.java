package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.BoooksEntity;
import com.example.demo.Service.Booksservice;

@RestController
@RequestMapping("/api/books")
public class Bookscontroller {
	
	@Autowired
     Booksservice bookser;
     
     @GetMapping
     
     public List<BoooksEntity> getAllBooks()
     {
    	 return bookser.getAllBooks();
     }
     
     @PostMapping
     
     public BoooksEntity addBooks(@RequestBody BoooksEntity books)
     {
    	 return bookser.addBooks(books);
     }
     
     @PutMapping("/{id}")
     
     public BoooksEntity updateBooks(@RequestBody BoooksEntity books)
     {
    	 return bookser.updateBooks(books);
     }
     @DeleteMapping("/{id}")
     public void deleteBooks(@PathVariable int id)
     {
    	 bookser.deleteBooks(id);
     }
     
 
}
