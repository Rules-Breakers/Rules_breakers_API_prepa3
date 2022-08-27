package com.hackathon3.endpoint.mapper;

import com.hackathon3.endpoint.mapper.restBook.NewBook;
import com.hackathon3.endpoint.mapper.restBook.RestBook;
import com.hackathon3.model.Book;
import com.hackathon3.model.Category;
import com.hackathon3.repository.BorrowRepository;
import com.hackathon3.service.BookService;
import com.hackathon3.service.CategoryService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Getter
@Component
public class BookMapper {
    private final BookService service;
    private final CategoryService categories;
    private final BorrowRepository repository;
    public Book toDomain(NewBook toCreate) {
        Book domainBook = new Book();
        domainBook.setName(toCreate.getName());
        domainBook.setAuteur(toCreate.getAuteur());
        domainBook.setAvailable(toCreate.isAvailable());
        domainBook.setPage_size(toCreate.getPage_size());
        List<Category> categoryList = categories.getCategories(toCreate.getCategory());
        domainBook.setCategory(categoryList);
        return domainBook;
    }
    public RestBook toRest(Book book) {
        RestBook restBook = new RestBook();
        restBook.setId(book.getId());
        restBook.setName(book.getName());
        int borrow = repository.countBorrowingDate(book);
        restBook.setBorrow(borrow);
        restBook.setAuteur(book.getAuteur());
        restBook.setPage_size(book.getPage_size());
        restBook.setAvailable(book.isAvailable());
        restBook.setCategory(book.getCategory());
        return restBook;
    }

    public List<Book> bookList(List<NewBook> newbook) {
        return newbook.stream().map(this::toDomain).toList();
    }
}
