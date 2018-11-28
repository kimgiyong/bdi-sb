package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.collection.Books;

@Repository
public interface BooksRepository extends MongoRepository<Books, String> {

	@Query("{name:?0}")
	public Books findByName(String name);
	

/*	@Query("{name:?0},{price:?1}")
	public int insertByNamePrice(Books book);
	
	@Query("{name:?0},{price:?1}")
	public int updateByNamePrice(Books book);
	
	@Query("{name:?0}")
	public int deleteByName(String name);
	*/
}
