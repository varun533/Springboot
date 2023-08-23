package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.BoooksEntity;
import com.example.demo.Repository.BooksRepository;

@Service
public class Booksservice {
	@Autowired
	BooksRepository booksrepo;
	
	public List<BoooksEntity> getAllBooks()
	{
		return booksrepo.findAll();
	}
	public BoooksEntity addBooks(BoooksEntity book)
	{
		return booksrepo.save(book);
	}
	public BoooksEntity updateBooks(BoooksEntity book)
	{
		return booksrepo.saveAndFlush(book);
	}
	public void deleteBooks(int id)
	{
		booksrepo.deleteById(id);
	}

}
