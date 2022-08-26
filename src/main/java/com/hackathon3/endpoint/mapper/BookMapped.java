package com.hackathon3.endpoint.mapper;

import com.hackathon3.model.Book;
import com.hackathon3.model.Category;
import com.hackathon3.model.NewBook;
import com.hackathon3.service.BookService;
import com.hackathon3.service.CategoryService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Getter
@Component
public class BookMapped {
    private final BookService service;
    private final CategoryService categories;
    public Book toDomain(Book book) {
        Book domainBook = new Book();
        domainBook.setId(book.getId());
        domainBook.setName(book.getName());
        List<Category> category = categories.getCategories((List<NewBook>) book.getCategory().get(1));
        domainBook.setCategory(category);
        return domainBook;
    }

    public List<Book> bookList(List<Book> book) {
        return book.stream().map(this::toDomain).toList();
    }
}
