package com.sogeti.tmap.testground.book.controller;

import com.sogeti.tmap.testground.book.services.BookServices;
import com.sogeti.tmap.testground.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookServices bookServices;

    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @GetMapping
    public String bookHome(Model model) {
        List<Book> allBooks = bookServices.getAllBooks();
        model.addAttribute("bookList", allBooks);

        return "books";
    }

}
