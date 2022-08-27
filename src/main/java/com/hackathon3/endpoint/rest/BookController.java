package com.hackathon3.endpoint.rest;

import com.hackathon3.endpoint.mapper.BookMapper;
import com.hackathon3.endpoint.mapper.restBook.NewBook;
import com.hackathon3.endpoint.mapper.restBook.RestBook;
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
    private BookMapper bookMapper;
    @GetMapping
    public List<RestBook> get(
            @RequestParam int page,
            @RequestParam int page_size
    ) {
        return bookService.getAll(page, page_size).stream()
                .map(bookMapper::toRest)
                .toList();
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
    public List<RestBook> createCocktails(@RequestBody List<NewBook> book) {
        return bookService.saveAllBook(bookMapper.bookList(book)).stream()
                .map(bookMapper::toRest).toList();
    }
}
