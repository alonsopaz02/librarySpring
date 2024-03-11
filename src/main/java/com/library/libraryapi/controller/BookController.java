package com.library.libraryapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.library.libraryapi.model.BookModel;
import com.library.libraryapi.service.BookService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/books")
public class BookController {
    
    @Autowired
    private BookService bookService;

    @GetMapping
    public ArrayList<BookModel> getBooks(){
        return this.bookService.getBooks();
    }
    
    @PostMapping
    public BookModel saveBook(@RequestBody BookModel book){
        return this.bookService.saveBook(book);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<BookModel> getBookById(@PathVariable("id") Long id){
        return this.bookService.getBookById(id);
    }

    @PutMapping(path = "/{id}")
    public BookModel updateBookById(@PathVariable("id") Long id, @RequestBody BookModel request){
        return this.bookService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.bookService.deleteBook(id);

        if(ok){
            return "User with id "+id+" deleted";
        }else{
            return "Error";
        }
    }
    
}
