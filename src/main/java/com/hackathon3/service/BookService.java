package com.hackathon3.service;

import com.hackathon3.model.Book;
import com.hackathon3.model.Category;
import com.hackathon3.model.NewBook;
import com.hackathon3.repository.BookRepo;
import com.hackathon3.repository.CategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class BookService {
    private final BookRepo bookRepo;
    public List<Book> getAll(int page , int page_size) {
        Pageable pageable = PageRequest.of(page,page_size);
        return  bookRepo.findAll(pageable).toList();
    }
    public List<Book> getBookStatus (int page , int page_size , boolean available) {
        Pageable pageable = PageRequest.of(page,page_size);
        return bookRepo.findBookByAvailable(pageable , available);
    }
    public List<Book> saveAllBook(List<Book> toWrite) {
        return bookRepo.saveAll(toWrite);
    }
}
