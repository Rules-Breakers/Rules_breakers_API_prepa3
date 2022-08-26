package com.hackathon3.endpoint.rest;

import com.hackathon3.endpoint.mapper.BookMapped;
import com.hackathon3.model.Book;
import com.hackathon3.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    private final BookMapped bookMapped;
    @GetMapping
    public List<Book> getBooks(@RequestParam int page ,
                               @RequestParam int page_size
                               ) {
        return bookService.getAll(page,page_size);
    }
    @GetMapping("/{available}")
    public List<Book> getBorrowBook (
            @RequestParam int page ,
            @RequestParam int page_size,
            @PathVariable boolean available
    ){
        return bookService.getBookStatus(page,page_size,available);
    }
    @PostMapping
    public List<Book> createCocktails(@RequestBody List<Book> book) {
        return bookService.saveAllBook(bookMapped.bookList(book));
    }
}
