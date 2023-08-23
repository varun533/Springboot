package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.BoooksEntity;

@Repository
public interface BooksRepository extends JpaRepository<BoooksEntity, Integer> {
	

}
