package com.sogeti.tmap.testground.book.services;

import com.sogeti.tmap.testground.book.repository.BookRepository;
import com.sogeti.tmap.testground.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    private final BookRepository bookRepository;


    public BookServices(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
