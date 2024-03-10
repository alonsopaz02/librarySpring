package com.library.libraryapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/books")
public String requestMethodName(@RequestParam String param) {
    return new String();
}

public class BookController {
    
}
