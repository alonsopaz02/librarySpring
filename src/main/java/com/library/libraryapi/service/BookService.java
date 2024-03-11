package com.library.libraryapi.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.libraryapi.model.BookModel;
import com.library.libraryapi.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    BookRepository bookRepository;

    public ArrayList<BookModel> getBooks(){
        return (ArrayList<BookModel>) bookRepository.findAll();
    }

    public BookModel saveBook(BookModel book){
        return bookRepository.save(book);
    }

    public Optional<BookModel> getBookById(Long bookId) {
        return bookRepository.findById(bookId);
    }

    public BookModel updateById(BookModel request, Long id){
        BookModel book = bookRepository.findById(id).get();

        book.setAuthor(request.getAuthor());
        book.setRating(request.getRating());
        book.setTitle(request.getTitle());
        book.setReview(request.getReview());

        return book;
    }

    public Boolean deleteBook (Long id){
        try{
            bookRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
