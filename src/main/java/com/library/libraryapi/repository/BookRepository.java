package com.library.libraryapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.libraryapi.model.BookModel;

@Repository
public interface BookRepository extends CrudRepository<BookModel,Long> {
     
}
